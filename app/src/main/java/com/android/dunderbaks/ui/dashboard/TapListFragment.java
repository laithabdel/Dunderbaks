package com.android.dunderbaks.ui.dashboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.android.dunderbaks.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.regex.Pattern;

public class TapListFragment extends Fragment {

    @SuppressLint("AddJavascriptInterface")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_tap_list, container, false);

        WebView webView = root.findViewById(R.id.wvTapList);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        MyJavaScriptInterface jInterface = new MyJavaScriptInterface(root.getContext());
        webView.addJavascriptInterface(jInterface, "HtmlViewer");
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {

             @Override
             public void onPageFinished(WebView view, String url) {
                 //Load HTML
                 webView.loadUrl("javascript:HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
             }
         });


        webView.loadUrl("https://www.buildabeer.org/WhatsOnTapAt/WhatsOnTapAtApp.php?BarID=USAFL00014");


        new Thread(() -> {
            System.out.println("Thread is open");

            try {
                Document document = Jsoup.connect("https://www.buildabeer.org/WhatsOnTapAt/WhatsOnTapAtApp.php?BarID=USAFL00014")
                        .timeout(6000)
                        .get();

                Element script = document.select("script").first();

//                System.out.println(document.html());





            } catch (Exception ignored) {}
        }).start();



        return root;
    }

    static class MyJavaScriptInterface {

        private Context ctx;
        public String html;

        MyJavaScriptInterface(Context ctx) {
            this.ctx = ctx;
        }

        @JavascriptInterface
        public void showHTML(String _html) {
            html = _html;
            System.out.println(html);

        }
    }
}