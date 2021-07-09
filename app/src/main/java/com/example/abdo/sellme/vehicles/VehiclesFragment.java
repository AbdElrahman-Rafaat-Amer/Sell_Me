package com.example.abdo.sellme.vehicles;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abdo.sellme.R;


import java.util.ArrayList;


public class VehiclesFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Vehicles> list = new ArrayList<>();
    private VehiclesAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vehicles, container, false);

        recyclerView = view.findViewById(R.id.recycler_vehicles);
        list.add(new Vehicles("Item 1", "There is some information about item 1", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 2", "There is some information about item 2", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 3", "There is some information about item 3", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 4", "There is some information about item 4", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 5", "There is some information about item 5", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 6", "There is some information about item 6", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 7", "There is some information about item 7", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 8", "There is some information about item 8", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 9", "There is some information about item 9", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 10", "There is some information about item 10", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 11", "There is some information about item 11", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 12", "There is some information about item 12", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 13", "There is some information about item 13", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 14", "There is some information about item 14", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 15", "There is some information about item 15", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 16", "There is some information about item 16", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 17", "There is some information about item 17", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 18", "There is some information about item 18", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 19", "There is some information about item 19", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 20", "There is some information about item 20", R.drawable.ic_shopping_bag));
        list.add(new Vehicles("Item 21", "There is some information about item 21", R.drawable.ic_shopping_bag));

        adapter = new VehiclesAdapter(list, getContext());
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }
}