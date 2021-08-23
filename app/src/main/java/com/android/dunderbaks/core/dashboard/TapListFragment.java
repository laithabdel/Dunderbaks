package com.android.dunderbaks.core.dashboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.android.dunderbaks.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TapListFragment extends Fragment {

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_tap_list, container, false);
        WebView webView = root.findViewById(R.id.wvTapList);
        webView.clearCache(true);
//        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        MyJavaScriptInterface jInterface = new MyJavaScriptInterface(root.getContext());
        webView.addJavascriptInterface(jInterface, "HtmlViewer");
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url,
                                      Bitmap favicon) {
            }

            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onPageFinished(WebView view, String url) {
                view.evaluateJavascript("javascript:for(let i = 10001; i < 10067; i++)" +
                        "document.getElementById('InfoIdx' + i).click();",
                        null);
                view.evaluateJavascript("javascript:setTimeout(window.HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML), 1000);", null);


//                webView.loadUrl("javascript:window.HtmlViewer.showHTML(document.getElementsByTagName('script')[3].innerHTML)");
                new Thread(() -> {
                     while (jInterface.html == null);
//                     System.out.println(jInterface.html);
                     Document doc = Jsoup.parse(jInterface.getHtml());
                     Elements beerNames = doc.select("span.BName");
                     Elements beerInfo = doc.select("span.BI");
                     for (int i = 0; i < beerNames.size(); i++) {
                         System.out.println(beerNames.get(i).text());
                         System.out.println(beerInfo.get(i).text());
                     }
                }).start();
            }
         });

        webView.loadUrl("https://www.buildabeer.org/WhatsOnTapAt/WhatsOnTapAtApp.php?BarID=USAFL00014");


        return root;
    }

    static class MyJavaScriptInterface {

        private Context ctx;
        public String html;

        MyJavaScriptInterface(Context ctx) {
            this.ctx = ctx;
        }

        @JavascriptInterface
        @SuppressWarnings("unused")
        public void showHTML(String _html) {
            html = _html;

        }

        public String getHtml() {
            return html;
        }
    }
}