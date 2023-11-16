package com.example.seniorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.parceler.Parcels;

public class CompareSchoolsActivity extends AppCompatActivity implements View.OnClickListener{

    //private List<StateNameItem> stateNameItemList;
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
        Button seeStateOneInfoButton = findViewById(R.id.seeStateOneInfoButton);
        Button seeStateTwoInfoButton = findViewById(R.id.seeStateTwoInfoButton);
        Button startComparisonButton = findViewById(R.id.startComparisonButton);
        EditText enterSalaryEditText = findViewById(R.id.enterTuitionEditText);
        stateOneAutoCompleteTextView = findViewById(R.id.firstStateACTV);
        stateTwoAutoCompleteTextView = findViewById(R.id.secondStateACTV);

        // States name array
        String[] stateNameArray = getResources().getStringArray(R.array.stateNames);

        // Make array adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(CompareSchoolsActivity.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                stateNameArray);

        // Set adapter for autocomplete
        stateOneAutoCompleteTextView.setAdapter(arrayAdapter);
        stateTwoAutoCompleteTextView.setAdapter(arrayAdapter);

        // Init Data
        stateData = new Data();

        // Set onclick listeners
        startComparisonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stateOneAutoCompleteTextView.getText().toString().equals("") ||
                        stateTwoAutoCompleteTextView.getText().toString().equals("") ||
                        enterSalaryEditText.getText().toString().equals("")
                ) {
                    // Make Toast later
                    return;
                }
                String stateOneName = stateOneAutoCompleteTextView.getText().toString().toLowerCase();
                String stateTwoName = stateTwoAutoCompleteTextView.getText().toString().toLowerCase();
                State stateOne = stateData.states.get(stateOneName);
                State stateTwo = stateData.states.get(stateTwoName);

                Intent comparisonIntent = new Intent(CompareSchoolsActivity.this, ComparisonActivity.class);
                comparisonIntent.putExtra("salary", enterSalaryEditText.getText().toString());
                comparisonIntent.putExtra("stateOne", Parcels.wrap(stateOne));
                comparisonIntent.putExtra("stateTwo", Parcels.wrap(stateTwo));
                startActivity(comparisonIntent);
            }
        });
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
    }
}