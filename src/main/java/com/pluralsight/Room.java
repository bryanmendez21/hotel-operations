package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Constructor
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean isOccupied(){
        return this.occupied;
    }
    public boolean isDirty(){
        return this.dirty;
    }
    public boolean isAvailable(){
        return (isDirty() && !isOccupied());
    }
    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }
    public void checkout(){
        this.occupied = false;
    }
    public void cleanroom(){
        this.dirty = false;
    }
}
