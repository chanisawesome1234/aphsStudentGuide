package com.rr.aphsstudentguide;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        setTitle("Subjects");





    }



    public void CivicsAndCareersOnclick(View v)
    {
        startActivity(new Intent(Subjects.this, CivicsAndCareers.class));
    }

    public void EnglishOnclick(View v)
    {
        startActivity(new Intent(Subjects.this, English.class));
    }




}
