package com.example.abdo.sellme.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.abdo.sellme.R;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private PageAdapterLoginSignUp pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        viewPager = findViewById(R.id.view_pager_login_signUp);
        tabLayout = findViewById(R.id.tab_login_sigUp);

        pageAdapter = new PageAdapterLoginSignUp(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        tabLayout.addTab(tabLayout.newTab().setText(R.string.login));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.signUp));

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