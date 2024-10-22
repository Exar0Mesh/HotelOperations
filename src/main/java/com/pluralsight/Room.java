package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    private boolean checkIn;
    private boolean checkOut;
    private String cleanRoom;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getPrice() {
        return price;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public boolean isDirty() {
        return dirty;
    }
    public String getCleanRoom() {
        return cleanRoom;
    }
    public boolean isAvailable() {
        if (dirty = false) {
            if (occupied = false) {
                available = true;
            }
        } else {
            available = false;
        }
        return available;
    }

    public boolean isCheckIn() {
        if (checkIn = true) {
            checkIn = dirty && occupied;
        }
        return checkIn;
    }
    public boolean isCheckout() {
        if (checkOut = true) {
            System.out.println(cleanRoom);
        }
        return checkOut;
    }
}
