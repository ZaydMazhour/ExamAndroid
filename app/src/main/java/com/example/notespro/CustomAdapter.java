package com.example.notespro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Food> {
    ArrayList<Food> mList;
    Context mContext;
    public CustomAdapter(Context context, ArrayList<Food> mList){
        super(context,0,mList);
        this.mList=mList;
        this.mContext=context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        if (v==null){
            v= LayoutInflater.from(mContext).inflate(R.layout.list_item, parent,false);
        }

        Food animalCourant = mList.get(position);
            ImageView image = v.findViewById(R.id.image);
            image.setImageResource(animalCourant.getmImage());
            TextView name = v.findViewById(R.id.name);
            name.setText(animalCourant.getmName());
            TextView description = v.findViewById(R.id.description);
            description.setText(animalCourant.getmDescription());
        return v;
    }
}

