package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (numberOfRooms > 0) {
            if (numberOfSuites > 0) {
                isSuite = true;
            } else {
                isSuite = false;
            }
            return true;
        } else {
            return false;
        }
    }
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }
    public int getAvailableRooms() {
        return numberOfRooms - bookedRooms;
    }
}
