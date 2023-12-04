package com.example.googlemapspractice;

import java.util.ArrayList;

public class School {
    public static ArrayList<School> schoolList = new ArrayList<>();

    private final String schoolName;
    private final String city;
    private final String state;

    private int annualIncome;
    private double netIncome;
    private int inStateTuition;
    private int outStateTuition;
    private final int tuition;

    private final double lat;
    private final double lon;

    public School(String schoolName, String city, String state, int tuition, double lat, double lon) {
        this.schoolName = schoolName;
        this.city = city;
        this.state = state;
        this.tuition = tuition;
        this.lat = lat;
        this.lon = lon;

        calculateNetIncome();
    }

    private void calculateNetIncome() {
        Data stateData = new Data();
        State stateOne = stateData.states.get(this.state);

        double taxes = 0.0;

        // Federal income tax
        if (this.annualIncome >= 523601){
            taxes += 157804.25 + 0.37*(this.annualIncome-523600);
        }
        else if (this.annualIncome >= 209426){
            taxes += 47843 + 0.35*(this.annualIncome-209425);
        }
        else if (this.annualIncome >= 164926){
            taxes += 33603 + 0.32*(this.annualIncome-164925);
        }
        else if (this.annualIncome >= 86376){
            taxes += 14751 + 0.24*(this.annualIncome-86375);
        }
        else if (this.annualIncome >= 40526){
            taxes += 4664 + 0.22*(this.annualIncome-40525);
        }
        else if (this.annualIncome >= 9951){
            taxes += 995 + 0.12*(this.annualIncome-9950);
        }
        else {
            taxes += 0.1*(this.annualIncome);
        }

        // Social security and medicare taxes
        taxes += 0.0765*(this.annualIncome);

        // State income tax
        taxes += stateOne.incomeTax*(this.annualIncome);

        this.netIncome = this.annualIncome - taxes;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getCity(){
        return city;
    }

    public int getAnnualIncome() { return annualIncome; }

    public double getNetIncome() {
        return netIncome;
    }

    public double getInStateTuition() {
        return inStateTuition;
    }

    public double getOutStateTuition() {
        return outStateTuition;
    }

    public double getTuition() {
        return tuition;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }
}
