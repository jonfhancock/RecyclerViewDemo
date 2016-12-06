package com.jonfhancock.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jonhancock on 12/5/16.
 */

public class DataModelViewHolder extends RecyclerView.ViewHolder {

    private final OnDataModelClickListener clickListener;

    public interface OnDataModelClickListener{
        void onWholeItemClicked(DataModel data);
        void onAgeClicked(DataModel data);
    }

    @BindView(R.id.text_first_name)  TextView textFirstName;
    @BindView(R.id.text_last_name)  TextView textLastName;
    @BindView(R.id.text_age)  TextView textAge;

    DataModel data;

    @OnClick(R.id.item_container)
    void onWholeItemClicked(){
        this.clickListener.onWholeItemClicked(data);
    }
    @OnClick(R.id.text_age)
    void onAgeClicked(){
        this.clickListener.onAgeClicked(data);
    }

    public DataModelViewHolder(View itemView,OnDataModelClickListener clickListener) {
        super(itemView);
        this.clickListener = clickListener;
        ButterKnife.bind(this,itemView);


    }

    public void setData(DataModel data) {
        this.data = data;
        textFirstName.setText(data.getFirstName());
        textLastName.setText(data.getLastName());
        textAge.setText(String.valueOf(data.getAge()));
    }
}
