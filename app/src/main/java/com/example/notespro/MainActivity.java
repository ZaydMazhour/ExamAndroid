package com.example.notespro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static String username;
    FloatingActionButton addNoteBtn;
    FloatingActionButton deleteNoteBtn;
    CustomAdapter adapter;
    ListView list;
    ArrayList<Food> FoodList = new ArrayList<Food>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNoteBtn = findViewById(R.id.add_note_btn);
        addNoteBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,FoodDetailsActivity.class)));

        //LIST
        list = findViewById(R.id.list);
        FoodList = new ArrayList<Food>();
        FoodList.add(new Food(R.drawable.app,"150000 DH","appartement de vente en Rabat"));
        FoodList.add(new Food(R.drawable.app2,"200000 DH","appartement de vente en Casablanca"));
        FoodList.add(new Food(R.drawable.app3,"300000 DH"," appartement de vente en Salé"));
        FoodList.add(new Food(R.drawable.app4,"400000 DH"," appartement de vente en Tanger"));
        FoodList.add(new Food(R.drawable.app5,"1000000 DH","appartement de vente en Nador"));




        adapter = new CustomAdapter(getApplicationContext(),FoodList);
        list.setAdapter(adapter);
    }
}