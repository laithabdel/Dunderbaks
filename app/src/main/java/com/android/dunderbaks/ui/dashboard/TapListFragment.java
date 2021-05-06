package com.android.dunderbaks.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.android.dunderbaks.R;

public class TapListFragment extends Fragment {

    private TapListViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(TapListViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tap_list, container, false);

        WebView myWebView = root.findViewById(R.id.wvTapList);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.buildabeer.org/WhatsOnTapAt/WhatsOnTapAtApp.php?BarID=USAFL00014");


//        final TextView textView = root.findViewById(R.id.text_dashboard);

//        dashboardViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }
}