package com.example.googlemapspractice;
import java.util.HashMap;
import java.util.Map;

public class Tuition {

    static class inOrOutTuition {
        double inState;
        double outOfState;

        inOrOutTuition(double inState, double outOfState) {
            this.inState = inState;
            this.outOfState = outOfState;
        }
    }

    public static Map<String, inOrOutTuition> getTuitionInfo() {
        Map<String, inOrOutTuition> tuitionMap = new HashMap<>();

        tuitionMap.put("University A", new inOrOutTuition(10000, 20000));
        tuitionMap.put("University B", new inOrOutTuition(12000, 22000));
        tuitionMap.put("University C", new inOrOutTuition(15000, 25000));

        return tuitionMap;
    }

    public static void main(String[] args) {
        Map<String, inOrOutTuition> tuitionInfo = getTuitionInfo();

        // Displaying the tuition information
        for (Map.Entry<String, inOrOutTuition> entry : tuitionInfo.entrySet()) {
            System.out.println("School: " + entry.getKey() + ", In-State Tuition: "
                    + entry.getValue().inState + ", Out-of-State Tuition: "
                    + entry.getValue().outOfState);
        }
    }
}
