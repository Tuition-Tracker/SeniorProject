package com.example.googlemapspractice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button compareSchools;
    Button myschools;
    Button howitworks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assignId(compareSchools, R.id.compareSchoolsButton);
        assignId(myschools,R.id.mySchools);
        assignId(howitworks,R.id.howitworks);
    }

    void assignId(Button btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();

        if (buttonText.equals("compare state taxes")) {
            Log.d("compare", "onClick: Clicked compare schools button");
            Intent compareIntent = new Intent(getBaseContext(), CompareSchoolsActivity.class);
            startActivity(compareIntent);
            return;
        }

        if (buttonText.equals("my schools")) {
            Intent myIntent = new Intent(getBaseContext(), MySchools.class);
            startActivity(myIntent);
            return;
        }

        if (buttonText.equals("how it works")) {
            Intent myIntent = new Intent(getBaseContext(), HowItWorks.class);
            startActivity(myIntent);
            return;
        }
    }
}
