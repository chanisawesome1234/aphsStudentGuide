package com.rr.aphsstudentguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ScrollView;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        setTitle("English");




    }


    public void scrollOnClick(View v)
    {
        final ScrollView scrollview = ((ScrollView) findViewById(R.id.scroll));
        scrollview.post(new Runnable() {

            @Override
            public void run() {
                scrollview.fullScroll(ScrollView.FOCUS_UP);
            }
        });
    }


    public void CNN (View view) {
        goToUrl("http://www.cnn.com/2016/06/10/us/earthquake-san-diego-california-irpt/index.html ");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
