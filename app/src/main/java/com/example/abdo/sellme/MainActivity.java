package com.example.abdo.sellme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.abdo.sellme.login.LoginActivity;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView logout, loggedAs;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("Pref", MODE_PRIVATE);

        viewPager = findViewById(R.id.view_pager_main);
        tabLayout = findViewById(R.id.tab_main);
        logout = findViewById(R.id.logout);
        loggedAs = findViewById(R.id.logged_as);

        loggedAs.setText(loggedAs.getText().toString() + " " +  sharedPreferences.getString("NAME", null));

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                finish();
            }
        });
        viewPager.setAdapter(new PageAdapterMain(getSupportFragmentManager()));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.vehicles).setIcon(R.drawable.ic_car));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.electronics).setIcon(R.drawable.ic_elctronics));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.fashion).setIcon(R.drawable.ic_fashion));

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}