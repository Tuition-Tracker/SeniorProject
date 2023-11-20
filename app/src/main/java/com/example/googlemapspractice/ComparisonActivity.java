package com.example.googlemapspractice;

import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

import org.parceler.Parcels;

public class ComparisonActivity extends AppCompatActivity {
    State stateOne;
    State stateTwo;
    String income = "";
    int s1Color, s2Color;

    TextView stateOneName, stateTwoName;
    TextView stateOneStateTax, stateTwoStateTax;
    TextView stateOneIncomeTax, stateTwoIncomeTax;
    TextView stateOneTakeHomePay, stateTwoTakeHomePay;
    TextView stateOneCOLIndex, stateTwoCOLIndex;
    TextView stateOneHousingIndex, stateTwoHousingIndex;
    TextView stateOneGroceriesIndex, stateTwoGroceriesIndex;
    TextView stateOneUtilitiesIndex, stateTwoUtilitiesIndex;
    TextView stateOneTransportationIndex, stateTwoTransportationIndex;
    TextView stateOneHealthIndex, stateTwoHealthIndex;
    TextView stateOneMiscellaneousIndex, stateTwoMiscellaneousIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        // Components
        stateOneName = findViewById(R.id.stateOneNameTextView);
        stateTwoName = findViewById(R.id.stateTwoNameTextView);
        stateOneStateTax = findViewById(R.id.stateOneStateTaxTextView);
        stateTwoStateTax = findViewById(R.id.stateTwoStateTaxTextView);
        stateOneIncomeTax = findViewById(R.id.stateOneIncomeTaxTextView);
        stateTwoIncomeTax = findViewById(R.id.stateTwoIncomeTaxTextView);
        stateOneTakeHomePay = findViewById(R.id.stateOneTakeHomePayTextView);
        stateTwoTakeHomePay = findViewById(R.id.stateTwoTakeHomePayTextView);
        stateOneCOLIndex = findViewById(R.id.stateOneCostOfLivingTextView);
        stateTwoCOLIndex = findViewById(R.id.stateTwoCostOfLivingTextView);
        stateOneHousingIndex = findViewById(R.id.stateOneHousingIndexTextView);
        stateTwoHousingIndex = findViewById(R.id.stateTwoHousingIndexTextView);
        stateOneGroceriesIndex = findViewById(R.id.stateOneGroceriesIndexTextView);
        stateTwoGroceriesIndex = findViewById(R.id.stateTwoGroceriesIndexTextView);
        stateOneUtilitiesIndex = findViewById(R.id.stateOneUtilitiesIndexTextView);
        stateTwoUtilitiesIndex = findViewById(R.id.stateTwoUtilitiesIndexTextView);
        stateOneTransportationIndex = findViewById(R.id.stateOneTransportationIndexTextView);
        stateTwoTransportationIndex = findViewById(R.id.stateTwoTransportationIndexTextView);
        stateOneHealthIndex = findViewById(R.id.stateOneHealthIndexTextView);
        stateTwoHealthIndex = findViewById(R.id.stateTwoHealthIndexTextView);
        stateOneMiscellaneousIndex = findViewById(R.id.stateOneMiscellaneousIndexTextView);
        stateTwoMiscellaneousIndex = findViewById(R.id.stateTwoMiscellaneousIndexTextView);

        // Passed in states
        stateOne = (State) Parcels.unwrap(getIntent().getParcelableExtra("stateOne"));
        stateTwo = (State) Parcels.unwrap(getIntent().getParcelableExtra("stateTwo"));
        income = getIntent().getStringExtra("income");

        // Debugging
//        Log.d("name", "onCreate: " + stateOne.name);
//        Log.d("name", "onCreate: " + stateTwo.name);
//        Log.d("name", "onCreate: $" + income);

        showData();
    }

    public void showData() {
        // Name
        stateOneName.setText(stateOne.name);
        stateTwoName.setText(stateTwo.name);

        // State Tax
        String string = String.valueOf(stateOne.stateTax) + "%";
        stateOneStateTax.setText(string);
        string = String.valueOf(stateTwo.stateTax) + "%";
        stateTwoStateTax.setText(string);

        if (stateOne.stateTax != stateTwo.stateTax) {
            s1Color = stateOne.stateTax < stateTwo.stateTax ? R.color.green : R.color.red;
            s2Color = stateTwo.stateTax < stateOne.stateTax ? R.color.green : R.color.red;
            stateOneStateTax.setTextColor(getResources().getColor(s1Color));
            stateTwoStateTax.setTextColor(getResources().getColor(s2Color));
        }

        // Income Tax
        string = String.valueOf(stateOne.incomeTax*100) + "%";
        stateOneIncomeTax.setText(string);
        string = String.valueOf(stateTwo.incomeTax*100) + "%";
        stateTwoIncomeTax.setText(string);

        if (stateOne.incomeTax != stateTwo.incomeTax) {
            s1Color = stateOne.incomeTax < stateTwo.incomeTax ? R.color.green : R.color.red;
            s2Color = stateTwo.incomeTax < stateOne.incomeTax ? R.color.green : R.color.red;
            stateOneIncomeTax.setTextColor(getResources().getColor(s1Color));
            stateTwoIncomeTax.setTextColor(getResources().getColor(s2Color));
        }

        // Take Home Pay
        Double stateTaxDeduction = (Double.parseDouble(income)) * (stateOne.stateTax / 100);
        Double incomeTaxDeduction = (Double.parseDouble(income)) * (stateOne.incomeTax / 100);
        Double state1TakeHomePay = Double.parseDouble(income) - stateTaxDeduction - incomeTaxDeduction;
        string = "$" + String.valueOf(state1TakeHomePay);
        stateOneTakeHomePay.setText(string);

        stateTaxDeduction = (Double.parseDouble(income)) * (stateTwo.stateTax / 100);
        incomeTaxDeduction = (Double.parseDouble(income)) * (stateTwo.incomeTax / 100);
        Double state2TakeHomePay = Double.parseDouble(income) - stateTaxDeduction - incomeTaxDeduction;
        string = "$" + String.valueOf(state2TakeHomePay);
        stateTwoTakeHomePay.setText(string);

        if (stateOneTakeHomePay != stateTwoTakeHomePay) {
            s1Color = state1TakeHomePay > state2TakeHomePay ? R.color.green : R.color.red;
            s2Color = state2TakeHomePay > state1TakeHomePay ? R.color.green : R.color.red;
            stateOneTakeHomePay.setTextColor(getResources().getColor(s1Color));
            stateTwoTakeHomePay.setTextColor(getResources().getColor(s2Color));
        }

        // Cost of Living Index
        string = String.valueOf(stateOne.costOfLivingIndex);
        stateOneCOLIndex.setText(string);
        string = String.valueOf(stateTwo.costOfLivingIndex);
        stateTwoCOLIndex.setText(string);

        if (stateOne.costOfLivingIndex != stateTwo.costOfLivingIndex) {
            s1Color = stateOne.costOfLivingIndex < stateTwo.costOfLivingIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.costOfLivingIndex < stateOne.costOfLivingIndex ? R.color.green : R.color.red;
            stateOneCOLIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoCOLIndex.setTextColor(getResources().getColor(s2Color));
        }

        // Housing index
        string = String.valueOf(stateOne.housingIndex);
        stateOneHousingIndex.setText(string);
        string = String.valueOf(stateTwo.housingIndex);
        stateTwoHousingIndex.setText(string);

        if (stateOne.housingIndex != stateTwo.housingIndex) {
            s1Color = stateOne.housingIndex < stateTwo.housingIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.housingIndex < stateOne.housingIndex ? R.color.green : R.color.red;
            stateOneHousingIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoHousingIndex.setTextColor(getResources().getColor(s2Color));
        }

        // Groceries index
        string = String.valueOf(stateOne.groceriesIndex);
        stateOneGroceriesIndex.setText(string);
        string = String.valueOf(stateTwo.groceriesIndex);
        stateTwoGroceriesIndex.setText(string);

        if (stateOne.groceriesIndex != stateTwo.groceriesIndex) {
            s1Color = stateOne.groceriesIndex < stateTwo.groceriesIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.groceriesIndex < stateOne.groceriesIndex ? R.color.green : R.color.red;
            stateOneGroceriesIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoGroceriesIndex.setTextColor(getResources().getColor(s2Color));
        }

        // Utilities index
        string = String.valueOf(stateOne.utilitiesIndex);
        stateOneUtilitiesIndex.setText(string);
        string = String.valueOf(stateTwo.utilitiesIndex);
        stateTwoUtilitiesIndex.setText(string);

        if (stateOne.utilitiesIndex != stateTwo.utilitiesIndex) {
            s1Color = stateOne.utilitiesIndex < stateTwo.utilitiesIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.utilitiesIndex < stateOne.utilitiesIndex ? R.color.green : R.color.red;
            stateOneUtilitiesIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoUtilitiesIndex.setTextColor(getResources().getColor(s2Color));
        }

        // Transportation index
        string = String.valueOf(stateOne.transportationIndex);
        stateOneTransportationIndex.setText(string);
        string = String.valueOf(stateTwo.transportationIndex);
        stateTwoTransportationIndex.setText(string);

        if (stateOne.transportationIndex != stateTwo.transportationIndex) {
            s1Color = stateOne.transportationIndex < stateTwo.transportationIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.transportationIndex < stateOne.transportationIndex ? R.color.green : R.color.red;
            stateOneTransportationIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoTransportationIndex.setTextColor(getResources().getColor(s2Color));
        }

        // Health index
        string = String.valueOf(stateOne.healthIndex);
        stateOneHealthIndex.setText(string);
        string = String.valueOf(stateTwo.healthIndex);
        stateTwoHealthIndex.setText(string);

        if (stateOne.healthIndex != stateTwo.healthIndex) {
            s1Color = stateOne.healthIndex < stateTwo.healthIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.healthIndex < stateOne.healthIndex ? R.color.green : R.color.red;
            stateOneHealthIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoHealthIndex.setTextColor(getResources().getColor(s2Color));
        }

        // Miscellaneous index
        string = String.valueOf(stateOne.miscellaneousIndex);
        stateOneMiscellaneousIndex.setText(string);
        string = String.valueOf(stateTwo.miscellaneousIndex);
        stateTwoMiscellaneousIndex.setText(string);

        if (stateOne.miscellaneousIndex != stateTwo.miscellaneousIndex) {
            s1Color = stateOne.miscellaneousIndex < stateTwo.miscellaneousIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.miscellaneousIndex < stateOne.miscellaneousIndex ? R.color.green : R.color.red;
            stateOneMiscellaneousIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoMiscellaneousIndex.setTextColor(getResources().getColor(s2Color));
        }
    }
}