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

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for inStateTuition
    public int getInStateTuition() {
        return inStateTuition;
    }

    public void setInStateTuition(int inStateTuition) {
        this.inStateTuition = inStateTuition;
    }

    // Getter and setter for outOfStateTuition
    public int getOutOfStateTuition() {
        return outOfStateTuition;
    }

    public void setOutOfStateTuition(int outOfStateTuition) {
        this.outOfStateTuition = outOfStateTuition;
    }
}

