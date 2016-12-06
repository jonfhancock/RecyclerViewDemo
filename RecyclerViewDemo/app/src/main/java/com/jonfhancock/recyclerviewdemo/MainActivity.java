package com.jonfhancock.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements DataModelViewHolder.OnDataModelClickListener {
    List<DataModel> dataModels;

    @BindView(R.id.list_view)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        dataModels = new ArrayList<>();
        populateDummyData();

        final DataAdapter dataAdapter = new DataAdapter(this);
        dataAdapter.setItems(dataModels);

        recyclerView.setAdapter(dataAdapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,getResources().getInteger(R.integer.columns));
        recyclerView.setLayoutManager(layoutManager);


    }

    private void populateDummyData() {
        dataModels.add(new DataModel("Jon","Hancock",34));
        dataModels.add(new DataModel("Kimberly","Hancock",34));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Michael","Hancock",8));
        dataModels.add(new DataModel("Noah","Hancock",6));
        dataModels.add(new DataModel("Orion","Hancock",3));
        dataModels.add(new DataModel("Linda","Hancock",69));
        dataModels.add(new DataModel("Jamie","Hancock",45));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
        dataModels.add(new DataModel("Leslie","Hancock",10));
    }

    @Override
    public void onWholeItemClicked(DataModel data) {
        Toast.makeText(MainActivity.this, "Whole item: " + data.getFirstName() + " was clicked.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAgeClicked(DataModel data) {
        Toast.makeText(MainActivity.this, "Age for " + data.getFirstName() + " is " + data.getAge(), Toast.LENGTH_SHORT).show();

    }
}
