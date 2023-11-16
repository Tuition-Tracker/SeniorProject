package com.example.seniorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MySchools extends AppCompatActivity implements View.OnClickListener{

    Button back;
    Button map;
    Button list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_schools);

        assignId(back,R.id.back);
        assignId(map,R.id.map);
        assignId(list,R.id.list);
    }

    void assignId(Button btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        if (buttonText.equals("back")) {
            Intent myIntent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(myIntent);
            return;
        }
        if (buttonText.equals("View by Map")) {
            Intent myIntent = new Intent(getBaseContext(), MapsActivity.class);
            startActivity(myIntent);
            return;
        }
    }
}