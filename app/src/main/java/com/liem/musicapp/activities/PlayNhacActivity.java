 package com.liem.musicapp.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.liem.musicapp.R;
import com.liem.musicapp.models.BaiHat;

import java.util.ArrayList;

 public class PlayNhacActivity extends AppCompatActivity {

    private BaiHat baiHat;
    private ArrayList<BaiHat> baiHatArrayList;

    private Toolbar toolbar;
    private SeekBar seekbar;
    private TextView txtTimeStart, txtTimeEnd;
    private ImageButton btnSuffle, btnPrev, btnPlay, btnNext, btnRepeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_nhac);

        getData();
        mapping();
        init();
    }

     private void mapping() {
        toolbar = findViewById(R.id.activityPlayNhac_toolBar);
        seekbar = findViewById(R.id.activityPlayNhac_seekBar);
        txtTimeStart = findViewById(R.id.activityPlayNhac_timeStart);
        txtTimeEnd = findViewById(R.id.activityPlayNhac_timeEnd);
        btnSuffle = findViewById(R.id.activityPlayNhac_btnSuffle);
        btnPrev = findViewById(R.id.activityPlayNhac_btnPrevious);
        btnPlay = findViewById(R.id.activityPlayNhac_btnPlay);
        btnNext = findViewById(R.id.activityPlayNhac_btnNext);
        btnRepeat = findViewById(R.id.activityPlayNhac_btnRepeat);
     }

     private void init(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        toolbar.setTitleTextColor(Color.WHITE);
     }

     private void getData() {
        Intent intent = getIntent();
        if(intent.hasExtra("baiHat")){
            baiHat = (BaiHat) intent.getSerializableExtra("baiHat");
        }
        if(intent.hasExtra("listBaiHat")){
            baiHatArrayList = intent.getParcelableArrayListExtra("listBaiHat");
        }
    }
}