package com.example.metroapplication.ui.metro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.metroapplication.R
import java.util.*

class MetroFragment : Fragment() {

    private lateinit var metroViewModel: MetroViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        metroViewModel =
                ViewModelProvider(this).get(MetroViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_metro, container, false)
        val myWebView: WebView = root.findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        myWebView.loadUrl("file:///android_asset/web/index.html")


        return root
    }
}