package com.example.googlemapspractice;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;

public class AddSchoolActivity extends AppCompatActivity {

    private EditText schoolNameET, locationET, incomeET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_school);
        initWidgets();
    }

    private void initWidgets()
    {
        schoolNameET = findViewById(R.id.schoolNameET);
        locationET = findViewById(R.id.locationET);
        incomeET = findViewById(R.id.incomeET);
    }

    public void saveSchoolAction(View view) throws IOException {
        String schoolName = schoolNameET.getText().toString();
        String location = locationET.getText().toString();
        int income = Integer.parseInt(incomeET.getText().toString());

        Geocoder geocoder = new Geocoder(this);

        List<Address> coords = geocoder.getFromLocationName(location, 1);
        List<Address> addresses = null;
        try {
            addresses = geocoder.getFromLocation(coords.get(0).getLatitude(), coords.get(0).getLongitude(), 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String cityName = addresses.get(0).getLocality();
        String state = addresses.get(0).getAdminArea();

        School newSchool = new School(schoolName, cityName, state, income, coords.get(0).getLatitude(), coords.get(0).getLongitude());
        School.schoolList.add(newSchool);
        Intent myIntent = new Intent(getBaseContext(), ViewByListActivity.class);
        startActivity(myIntent);
    }

}
