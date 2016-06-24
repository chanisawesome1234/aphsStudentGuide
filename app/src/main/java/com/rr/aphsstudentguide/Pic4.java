package com.rr.aphsstudentguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pic4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic4);
    }

    public void Web (View view) {
        goToUrl("https://www.google.ca/search?q=coverletter&espv=2&biw=1455&bih=726&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiGuK74q8HNAhXE1IMKHTuNAjsQ_AUIBigB#imgrc=OXXlhIxQsnnj2M%3A");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
