package com.liem.musicapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.liem.musicapp.R;
import com.liem.musicapp.models.QuangCao;

public class DanhSachBaiHatActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    RecyclerView recyclerView;
    FloatingActionButton floatingActionButton;
    QuangCao quangCao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_bai_hat);

        getQuangcao();
    }

    private void getQuangcao() {
        Intent intent = getIntent();
        if(intent.hasExtra("banners")){
            quangCao = (QuangCao) intent.getSerializableExtra("banners");
            Toast.makeText(this, quangCao.getTenBaiHat(), Toast.LENGTH_SHORT).show();
        }

    }
}