package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedBasicRooms, bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {      //This is for existing and new Hotels
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {

        if (this.getAvailableRooms() >= numberOfRooms && !isSuite) { //If you check true, you can assume they aren't true later on
            this.bookedRooms += numberOfRooms;
            return true;
        } else if (this.getAvailableSuites() >= numberOfRooms && isSuite) {
            this.bookedSuites += numberOfRooms;
            return true;
        }
            return false;       //Try to get away with not having properties, or a field. Can I get it from other ones first.
    }
    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites; //What are you trying to get, and where do they come from?
    }
    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedRooms;
    }
}
