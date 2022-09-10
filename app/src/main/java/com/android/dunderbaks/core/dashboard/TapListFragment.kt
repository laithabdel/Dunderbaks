package com.android.dunderbaks.core.dashboard

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.dunderbaks.R
import com.android.dunderbaks.core.adapter.DraftItemAdapter
import com.android.dunderbaks.core.model.TapListItem
import org.jsoup.Jsoup
import java.util.*

const val TAP_LIST_URL =
    "https://www.buildabeer.org/WhatsOnTapAt/WhatsOnTapAtApp.php?BarID=USAFL00014"
const val EXTRACT_DRAFT_LIST =
    "javascript:for(let i = 10001; i < 10067; i++)document.getElementById('InfoIdx' + i).click();"
const val SET_TIMEOUT =
    "javascript:setTimeout(window.HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML), 1000);"

class TapListFragment : Fragment() {
    val tapList: MutableList<TapListItem> = LinkedList()

    @SuppressLint("AddJavascriptInterface", "SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_tap_list, container, false)
        val webView = root.findViewById<WebView>(R.id.wvTapList)
        val rvTapList = root.findViewById<RecyclerView>(R.id.rvTapList)
        val spinner = root.findViewById<ProgressBar>(R.id.progressBar1)

        webView.loadUrl(TAP_LIST_URL)
        webView.clearCache(true)
        webView.settings.javaScriptEnabled = true
        val jInterface = MyJavaScriptInterface(root.context)
        webView.addJavascriptInterface(jInterface, "HtmlViewer")
        webView.webViewClient = object : WebViewClient() {

            override fun onPageFinished(view: WebView, url: String) {
                view.evaluateJavascript(EXTRACT_DRAFT_LIST, null)
                view.evaluateJavascript(SET_TIMEOUT, null)


                Thread {
                    //Full regex
//                    ((\d|\d\d).\d\d%) abv, Style: (?s)(.*) Brewery: (?s)(.*) Ratings : Ba:(\d{1,4}), rb:(\d{1,4}) (?s)(.*) Mug 10oz for \$(\d{1,2}.\d{2}) Pint for \$(\d{1,2}.\d{2}) Liter for \$(\d{1,2}.\d{2}) Growler 32oz for \$(\d{1,2}.\d{2})
                    //Full regex with category hints
//                    (\d{1,2}.\d\d%) abv, Style: (?s)(.*) Brewery: (?s)(.*) (Ratings : Ba:)(\d{1,4})(, rb:?)(\d{1,4}) (?s)(.*) (Mug 10oz for ?)\$(\d{1,2}.\d{2}) (Pint for ?)\$(\d{1,2}.\d{2}) (Liter for ?)\$(\d{1,2}.\d{2}) (Growler 32oz for ?)\$(\d{1,2}.\d{2})
                    //Full regex with grouped category hints
//((\d{1,2}.\d\d%) abv), (Style: (?s)(.*)) (Brewery: (?s)(.*)) ((?:Ratings : Ba:)*(\d{1,4})*|\s)((?:, rb:)*(\d{1,4})*|\s) (?s)(.*) ((?:Mug 10oz for )*(\$\d{1,2}.\d{2})*|\s) ((?:Pint for )*(\$\d{1,2}.\d{2})*|\s) ((?:Liter for )*(\$\d{1,2}.\d{2})*|\s) ((?:Growler 32oz for *(\$\d{1,2}.\d{2})*)|\s)


                    @Suppress("ControlFlowWithEmptyBody")
                    while (jInterface.html == null);

                    val html: String = jInterface.html ?: ""
                    val doc = Jsoup.parse(html)
//                    val beerIds = doc.select("span[id^=BeerNameId]")
//                    println(beerIds)
                    val beerNames = doc.select("span.BName")
                    val beerInfo = doc.select("span.BI")
                    for (i in beerNames.indices) {
                        if (i == 66)
                            break
                        val tapListItem = TapListItem()
                        if (beerNames[i].text().trim() == "Empty" || beerNames[i].text()
                                .trim() == "Offline" || beerNames[i].text().trim() == ""
                        )
                            continue
                        tapListItem.name = beerNames[i].text().trim()
                        tapListItem.description = beerInfo[i].text().trim()
                        println(tapListItem.description)
                        tapList.add(tapListItem)
                    }

                    // try to touch View of UI thread
                    activity?.runOnUiThread {
                        setupRecyclerView(rvTapList, tapList, root)
                        spinner.visibility = View.GONE
                    }
                }.start()

            }
        }

        return root
    }

    @Suppress("unused")
    internal class MyJavaScriptInterface(private val ctx: Context) {
        var html: String? = null

        @JavascriptInterface
        fun showHTML(_html: String) {
            html = _html
        }
    }

    private fun setupRecyclerView(rv: RecyclerView?, tapList: List<TapListItem?>, view: View) {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(view.context, RecyclerView.VERTICAL, false)
        rv!!.layoutManager = layoutManager
        val adapter = DraftItemAdapter(view.context, tapList)
        rv.adapter = adapter
    }

}