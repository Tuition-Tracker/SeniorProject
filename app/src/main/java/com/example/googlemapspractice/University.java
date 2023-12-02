package com.example.googlemapspractice;

public class University {
    private String state;
    private String name;
    private int inStateTuition;
    private int outOfStateTuition;

    // Constructor
    public University(String state, String name, int inStateTuition, int outOfStateTuition) {
        this.state = state;
        this.name = name;
        this.inStateTuition = inStateTuition;
        this.outOfStateTuition = outOfStateTuition;
    }

    // Getter and setter for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }
    public int getInStateTuition() {
        return inStateTuition;
    }
    public int getOutOfStateTuition() {
        return outOfStateTuition;
    }

    public void setName(String name) {
        this.name = name;
    }
}

