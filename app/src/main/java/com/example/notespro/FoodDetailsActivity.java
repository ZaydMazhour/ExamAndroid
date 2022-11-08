package com.example.notespro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FoodDetailsActivity extends AppCompatActivity {
    EditText titleEditText,contentEditText;
    ImageButton saveFoodBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        titleEditText = findViewById(R.id.food_title_text);
        contentEditText = findViewById(R.id.food_content_text);


        saveFoodBtn = findViewById(R.id.save_food_btn);
        saveFoodBtn.setOnClickListener(v -> saveFood());
    }
    void saveFood(){
        String foodTitle = titleEditText.getText().toString();
        String foodcontent = contentEditText.getText().toString();

        if (foodTitle==null || foodTitle.isEmpty()){
             titleEditText.setError("Title is required");
             return;
        }else{
            titleEditText.getText().toString();
            contentEditText.getText().toString();
            startActivity(new Intent(FoodDetailsActivity.this,MainActivity.class));
        }



    }
}