package com.pluralsight;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;


    public String getRoomType() {               //Getter
        return roomType;
    }
    public void setRoomType(String roomType) {  //Setter
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType == "king") {
            price = 139.00;
        } else if (roomType == "double") {
            price = 124.00;
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isIsWeekend() {
        return isWeekend;
    }
    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        if (isWeekend = true) {
            reservationTotal = numberOfNights * (price * 1.10);
        } else {
            reservationTotal = numberOfNights * price;
        }
        return reservationTotal;
    }
}
