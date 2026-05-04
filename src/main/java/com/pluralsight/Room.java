package com.pluralsight;

public class Room {

    int numberOfBeds;
    double price;
    boolean occupied;
    boolean dirty;

    // Constructor
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    int getNumberOfBeds(){
        return this.numberOfBeds;
    }
    double getPrice(){
        return this.price;
    }
    boolean isOccupied(){
        return this.occupied;
    }
    boolean isDirty(){
        return this.dirty;
    }
    boolean isAvailable(){
        return (isDirty() && !isOccupied());
    }
}
