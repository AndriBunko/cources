package com.abunko.leson3.taxiTarifCalculator;

/**
 * Created by Andrew on 17.07.2017.
 */
public class TaxiRide {
    private int passengers;
    private int duration;
    private int distance;

    public TaxiRide() {
    }

    public TaxiRide(int passengers, int duration, int distance) {
        this.passengers = passengers;
        this.duration = duration;
        this.distance = distance;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
