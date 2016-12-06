package com.jonfhancock.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonhancock on 12/5/16.
 */

public class DataAdapter extends RecyclerView.Adapter<DataModelViewHolder> {

    List<DataModel> items;
    private DataModelViewHolder.OnDataModelClickListener clickListener;

    public DataAdapter(DataModelViewHolder.OnDataModelClickListener clickListener) {
        this.clickListener = clickListener;
        items = new ArrayList<>();
    }

    public void setItems(List<DataModel> newItems) {
        this.items.clear();
        if(newItems != null){
            this.items.addAll(newItems);
        }
        notifyDataSetChanged();
    }

    @Override
    public DataModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        return new DataModelViewHolder(view,clickListener);
    }

    @Override
    public void onBindViewHolder(DataModelViewHolder holder, int position) {
        holder.setData(items.get(position));
    }



    @Override
    public int getItemCount() {
        return items.size();
    }



}
