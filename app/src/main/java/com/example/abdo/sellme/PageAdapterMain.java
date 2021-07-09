package com.example.abdo.sellme;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.abdo.sellme.electronics.ElectronicsFragment;
import com.example.abdo.sellme.fashion.FashionFragment;
import com.example.abdo.sellme.vehicles.VehiclesFragment;

public class PageAdapterMain extends FragmentPagerAdapter {
    public PageAdapterMain(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new VehiclesFragment();

            case 1:
                return new ElectronicsFragment();

            case 2:
                return new FashionFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
