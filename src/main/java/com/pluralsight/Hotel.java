package com.pluralsight;

public class Hotel {

    String name;
    int numberOfSuites;
    int numberOfRooms;
    int bookedSuites;
    int bookedBasicRooms;

    // Constructor
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = 0;
        this.bookedSuites = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(getAvailableRooms() > numberOfRooms && !isSuite){
            bookedBasicRooms += numberOfRooms;
            return true;
        }else if (getAvailableSuites() > numberOfRooms && isSuite){
            bookedSuites += numberOfRooms;
            return true;
        }else{
            return false;
        }
    }

}
