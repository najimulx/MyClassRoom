package com.pistudiosofficial.myclass.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.pistudiosofficial.myclass.R;
import com.pistudiosofficial.myclass.adapters.AdapterPagerView;
import com.pistudiosofficial.myclass.adapters.AdapterPagerViewHello;

public class HelloActivity extends AppCompatActivity {

    ViewPager viewPager;
    AdapterPagerViewHello adapterPagerViewHello;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        final ActionBar abar = getSupportActionBar();
        if(abar!=null) {
            abar.setDisplayHomeAsUpEnabled(true);
            abar.setTitle("Connections");
        }
        viewPager = findViewById(R.id.fragment_container_hello);
        adapterPagerViewHello = new AdapterPagerViewHello(getSupportFragmentManager());
        tabLayout = findViewById(R.id.tab_bar_hello);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapterPagerViewHello);
        viewPager.setCurrentItem(getIntent().getIntExtra("tab",0));

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return  false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
