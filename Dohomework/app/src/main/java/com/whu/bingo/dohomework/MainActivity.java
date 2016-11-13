package com.whu.bingo.dohomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.florent37.materialviewpager.MaterialViewPager;

public class MainActivity extends AppCompatActivity {
    private MaterialViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (MaterialViewPager) findViewById(R.id.materialViewPager);
    }
}
