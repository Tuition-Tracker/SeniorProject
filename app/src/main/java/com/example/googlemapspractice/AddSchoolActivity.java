package com.example.googlemapspractice;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;

public class AddSchoolActivity extends AppCompatActivity {

    private EditText schoolNameET, locationET;
    private RadioGroup tuitionRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_school);
        initWidgets();
    }

    private void initWidgets() {
        schoolNameET = findViewById(R.id.schoolNameET);
        locationET = findViewById(R.id.locationET);
        tuitionRadioGroup = findViewById(R.id.tuitionRadioGroup);
    }

    public void saveSchoolAction(View view) {
        try {
            String schoolName = schoolNameET.getText().toString();
            String location = locationET.getText().toString();
            int selectedTuitionId = tuitionRadioGroup.getCheckedRadioButtonId();
            boolean isInStateTuition = (selectedTuitionId == R.id.inStateRadioButton);

            Geocoder geocoder = new Geocoder(this);
            List<Address> coords = geocoder.getFromLocationName(location, 1);
            List<Address> addresses = null;
            try {
                addresses = geocoder.getFromLocation(coords.get(0).getLatitude(), coords.get(0).getLongitude(), 1);
            } catch (IOException e) {
                return;
            }
            String cityName = addresses.get(0).getLocality();
            String state = addresses.get(0).getAdminArea();

            UniversityData univData = new UniversityData();
            // Use UniversityData to get the tuition based on school name and in-state/out-of-state
            double tuition = univData.getTuition(schoolName, isInStateTuition);

            School newSchool = new School(schoolName, cityName, state, (int)tuition, coords.get(0).getLatitude(), coords.get(0).getLongitude());
            School.schoolList.add(newSchool);
            Toast.makeText(AddSchoolActivity.this, "School added successfully", Toast.LENGTH_SHORT).show();

            Intent myIntent = new Intent(getBaseContext(), ViewByListActivity.class);
            startActivity(myIntent);
        } catch (Exception e) {
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
