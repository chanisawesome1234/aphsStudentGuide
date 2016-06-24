package com.rr.aphsstudentguide;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.VideoView;

public class CivicsAndCareers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civics_and_careers);

        setTitle("Civics And Careers");





    }

    public void scrollOnClick2(View v)
    {
        final ScrollView scrollview = ((ScrollView) findViewById(R.id.scroll2));
        scrollview.post(new Runnable() {

            @Override
            public void run() {
                scrollview.fullScroll(ScrollView.FOCUS_UP);
            }
        });
    }

    public void Pic1onClick (View view) {
        startActivity(new Intent(CivicsAndCareers.this, Pics1.class));
    }

    public void Pic2onClick (View view) {
        startActivity(new Intent(CivicsAndCareers.this, Pic2.class));
    }

    public void Pic3onClick (View view) {
        startActivity(new Intent(CivicsAndCareers.this, Pic3.class));
    }

    public void Pic4onClick (View view) {
        startActivity(new Intent(CivicsAndCareers.this, Pic4.class));
    }


    public void goToSo (View view) {
        goToUrl("https://en.wikipedia.org/wiki/October_Sky");
    }

    public void goToSo2 (View view) {
        goToUrl("https://public.careercruising.com/en/");
    }

    public void goToSo3 (View view) {
        goToUrl("https://www.livecareer.com/resume-builder");
    }

    public void goToSo4 (View view) {
        goToUrl("https://en.wikipedia.org/wiki/The_Pursuit_of_Happyness");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
