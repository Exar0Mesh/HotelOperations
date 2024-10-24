package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private String cleanRoom;

    public Room(boolean occupied, boolean dirty, double price, int numberOfBeds) {
        this.occupied = occupied;
        this.dirty = dirty;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
    }
    public void cleanRoom() {
        this.dirty = false;
    }
    public void checkout() {
        this.occupied = false;
    }

    public void checkIn() {
        if(this.isAvailable()) {    //If it is not available, then it is false
            this.occupied = true;
            this.dirty = true;
        } else {
            System.out.println("Sorry, room is not available");
        }
    }

    public void setOccupied(boolean occupied) {     //teacher did this
        this.occupied = occupied;
    }

    public boolean isAvailable() {
        return (!this.occupied && !this.dirty);
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getPrice() {
        return price;
    }
}
