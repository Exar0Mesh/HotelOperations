package com.pluralsight;

public class Reservation {
    //You dont need to do all of them?

    private String roomType;
    //private double price; Don't need this one apparently, cause we would need roomtype and number of nights for this
    //GetPrice is a derived getter
    private int numberOfNights;
    private boolean weekend;
    //private double reservationTotal;

//generate - constructor == public Reservation
    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;                               //These are setters basically
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }
    public double getReservationTotal() {
        return this.numberOfNights * this.getPrice();           //number of nights times price
    }

    public double getPrice() {
        double weekendFactor = (this.weekend) ? 1.1 : 1;        //if statement using question mark
        if (roomType.equalsIgnoreCase("king")) {
            return 139.00 * weekendFactor;
        } else {
            return 124.00 * weekendFactor;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }
}
