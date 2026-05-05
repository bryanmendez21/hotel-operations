package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;

    }

    String getRoomType(){
        return this.roomType;
    }
    void setRoomType(String roomType){
        this.roomType = roomType;
    }

    double getPrice(){
        if (this.roomType.equalsIgnoreCase("king"))
            return 139.00;
        else if (this.roomType.equalsIgnoreCase("double")) {
            return 124.00;
        }else{
            return 0;
        }

    }
    int getNumberOfNights(){
        return this.numberOfNights;
    }
    void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }
    boolean isWeekend(){
        return this.weekend;
    }
    void setIsWeekend(boolean weekend){
        this.weekend = weekend;
    }
    double getReservationTotal(){
        if (isWeekend()){
            return (this.price * 1.1) * this.numberOfNights;
        }
        return this.price * this.numberOfNights;
    }

}
