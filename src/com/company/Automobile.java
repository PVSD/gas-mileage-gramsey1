package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {
    public int currentGallons = 0;
    public int miles = 0;
    public int MPG = 0;
    public Automobile(int milesPerGallon){
        MPG = milesPerGallon;
    }

    public void fillUp(int gallons){
        currentGallons += gallons;
    }
    public void takeTrip(int miles){
        this.miles = miles;

        currentGallons = currentGallons - (miles/MPG);
    }
    public double reportFuel(){
        double fuel = currentGallons;

        return fuel;
    }

}