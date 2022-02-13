package com.android.dunderbaks.core.dashboard

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.android.dunderbaks.R
import org.jsoup.Jsoup

class TapListFragment : Fragment() {
    @SuppressLint("AddJavascriptInterface", "SetJavaScriptEnabled")
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_tap_list, container, false)
        val webView = root.findViewById<WebView>(R.id.wvTapList)
        webView.loadUrl("https://www.buildabeer.org/WhatsOnTapAt/WhatsOnTapAtApp.php?BarID=USAFL00014")
        webView.clearCache(true)
        webView.settings.javaScriptEnabled = true
        val jInterface = MyJavaScriptInterface(root.context)
        webView.addJavascriptInterface(jInterface, "HtmlViewer")
        webView.webViewClient = object : WebViewClient() {

            @RequiresApi(Build.VERSION_CODES.KITKAT)
            override fun onPageFinished(view: WebView, url: String) {
                view.evaluateJavascript("javascript:for(let i = 10001; i < 10067; i++)" +
                        "document.getElementById('InfoIdx' + i).click();",
                        null)
                view.evaluateJavascript("javascript:setTimeout(window.HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML), 1000);", null)


                Thread {
                    @Suppress("ControlFlowWithEmptyBody")
                    while (jInterface.html == null);
                    val doc = Jsoup.parse(jInterface.html)
                    val beerNames = doc.select("span.BName")
                    val beerInfo = doc.select("span.BI")
                    for (i in beerNames.indices) {
                        println("Beer Name: " + beerNames[i].text())
                        println("Beer Info: " + beerInfo[i].text())
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
        fun showHTML(_html: String?) {
            html = _html
        }
    }
}