package com.example.abdo.sellme.electronics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abdo.sellme.R;

import java.util.ArrayList;


public class ElectronicsFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Electronics> list = new ArrayList<>();
    private ElectronicsAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_electronic, container, false);


        recyclerView = view.findViewById(R.id.recycler_electronics);
        list.add(new Electronics("Item 1", "There is some information about item 1", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 2", "There is some information about item 2", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 3", "There is some information about item 3", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 4", "There is some information about item 4", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 5", "There is some information about item 5", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 6", "There is some information about item 6", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 7", "There is some information about item 7", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 8", "There is some information about item 8", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 9", "There is some information about item 9", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 10", "There is some information about item 10", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 11", "There is some information about item 11", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 12", "There is some information about item 12", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 13", "There is some information about item 13", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 14", "There is some information about item 14", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 15", "There is some information about item 15", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 16", "There is some information about item 16", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 17", "There is some information about item 17", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 18", "There is some information about item 18", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 19", "There is some information about item 19", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 20", "There is some information about item 20", R.drawable.ic_shopping_bag));
        list.add(new Electronics("Item 21", "There is some information about item 21", R.drawable.ic_shopping_bag));

        adapter = new ElectronicsAdapter(list, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(adapter);
        return view;
    }
}