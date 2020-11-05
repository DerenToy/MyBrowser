package com.example.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

import tr.edu.mu.ceng.mad.mybrowser.R;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

    public class MainActivity extends AppCompatActivity {
    Button btnGo;
    EditText txtAddress;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getIntent() !=null && getIntent().getData() !=null){
            txtAddress.setText(getIntent().getData().toString());
            webview.loadUrl(getIntent().getData().toString());
        }

        btnGo = findViewById(R.id.btnGo);
        webview=findViewById(R.id.webview);
        txtAddress=findViewById(R.id.txtAddress);
        webview.setWebViewClient(new WebViewClient());
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("http://"+ txtAddress.getText());
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    }

