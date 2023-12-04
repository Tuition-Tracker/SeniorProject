package com.example.googlemapspractice;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewByListActivity extends AppCompatActivity implements View.OnClickListener {

    Button back;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_by_list);

        assignId(back,R.id.back);
        assignId(add,R.id.add);

        init();
    }

    void assignId(Button btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    public void init() {
        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
        stk.setGravity(Gravity.CENTER);
        TableRow tbrow0 = new TableRow(this);
        tbrow0.setGravity(Gravity.CENTER);

        TextView tv0 = new TextView(this);
        tv0.setText(" School ");
        tv0.setTextColor(Color.DKGRAY);
        tbrow0.addView(tv0);

        TextView tv1 = new TextView(this);
        tv1.setText(" Location ");
        tv1.setTextColor(Color.DKGRAY);
        tbrow0.addView(tv1);

        TextView tv2 = new TextView(this);
        tv2.setText(" Tuition ");
        tv2.setTextColor(Color.DKGRAY);
        tbrow0.addView(tv2);

        TextView tv3 = new TextView(this);
        tv3.setText("");
        tv3.setTextColor(Color.DKGRAY);
        tbrow0.addView(tv3);
        stk.addView(tbrow0);

        ArrayList<School> offerList = School.schoolList;
        for (School school : offerList) {
            TableRow tbrow = new TableRow(this);

            TextView t1v = new TextView(this);
            t1v.setText("" + school.getSchoolName());
            t1v.setTextColor(Color.rgb(115, 115, 115));
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);

            TextView t2v = new TextView(this);
            t2v.setText("" + school.getCity());
            t2v.setTextColor(Color.rgb(115, 115, 115));
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);

            TextView t3v = new TextView(this);
            t3v.setText("" + school.getTuition());
            t3v.setTextColor(Color.rgb(115, 115, 115));
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);

            TextView t4v = new TextView(this);
            t4v.setText("");
            t4v.setTextColor(Color.rgb(115, 115, 115));
            t4v.setGravity(Gravity.CENTER);
            tbrow.addView(t4v);
            stk.addView(tbrow);
        }
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        if (buttonText.equals("back")) {
            Intent myIntent = new Intent(getBaseContext(), MySchools.class);
            startActivity(myIntent);
            return;
        }

        if (buttonText.equals("Add New School +")) {
            Intent myIntent = new Intent(getBaseContext(), AddSchoolActivity.class);
            startActivity(myIntent);
            return;
        }
    }
}
