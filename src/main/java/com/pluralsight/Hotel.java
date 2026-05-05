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

    public boolean bookRoom(int numberOfRooms, boolean isSuite){

    }
    public void getAvailableSuites(){

    }
    public void getAvailableRooms(){

    }
}
