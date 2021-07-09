package com.example.abdo.sellme.login;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageAdapterLoginSignUp extends FragmentPagerAdapter {

    public PageAdapterLoginSignUp(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LoginFragment();

            case 1:
                return new SignUpFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
