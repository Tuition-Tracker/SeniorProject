package com.example.googlemapspractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.parceler.Parcels;

public class CompareSchoolsActivity extends AppCompatActivity implements View.OnClickListener {

    AutoCompleteTextView stateOneAutoCompleteTextView;
    AutoCompleteTextView stateTwoAutoCompleteTextView;

    // Data
    Data stateData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_schools);

        // Get components
        Button seeTaxesButton = findViewById(R.id.seeTaxesButton);
        Button startComparisonButton = findViewById(R.id.startComparisonButton);
        EditText enterIncomeEditText = findViewById(R.id.enterIncomeEditText);
        stateOneAutoCompleteTextView = findViewById(R.id.firstStateACTV);
        stateTwoAutoCompleteTextView = findViewById(R.id.secondStateACTV);

        // States name array
        String[] stateNameArray = getResources().getStringArray(R.array.stateNames);

        // Make array adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(CompareSchoolsActivity.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                stateNameArray);

        // Set adapter for autocomplete
        stateOneAutoCompleteTextView.setAdapter(arrayAdapter);
        stateTwoAutoCompleteTextView.setAdapter(arrayAdapter);

        // Init Data
        stateData = new Data();

        // Set onclick listeners
        startComparisonButton.setOnClickListener(view -> {
            if (stateOneAutoCompleteTextView.getText().toString().equals("") ||
                    stateTwoAutoCompleteTextView.getText().toString().equals("") ||
                    enterIncomeEditText.getText().toString().equals(""))
            {
                return;
            }
            String stateOneName = stateOneAutoCompleteTextView.getText().toString();
            String stateTwoName = stateTwoAutoCompleteTextView.getText().toString();
            State stateOne = stateData.states.get(stateOneName);
            State stateTwo = stateData.states.get(stateTwoName);

            Intent comparisonIntent = new Intent(CompareSchoolsActivity.this, ComparisonActivity.class);
            comparisonIntent.putExtra("income", enterIncomeEditText.getText().toString());
            comparisonIntent.putExtra("stateOne", Parcels.wrap(stateOne));
            comparisonIntent.putExtra("stateTwo", Parcels.wrap(stateTwo));
            startActivity(comparisonIntent);
        });

        // See taxes button
        seeTaxesButton.setOnClickListener(view -> {
            Intent taxIntent = new Intent(CompareSchoolsActivity.this, TaxesActivity.class);
            taxIntent.putExtra("income", Double.parseDouble(enterIncomeEditText.getText().toString()));
            startActivity(taxIntent);
        });
    }

    void assignId(Button btn,int id) {
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
        }
    }
}
