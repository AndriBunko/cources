package com.abunko.leson3.taxiTarifCalculator;

import java.util.ArrayList;

/**
 * Created by Andrew on 17.07.2017.
 */
public class TaxiRides {
    private final ArrayList<TaxiRide> taxiRides = new ArrayList<>();

    public long getPrice(Tariff tariff) {
        long price = 0;

        for (TaxiRide taxiRide : taxiRides) {
            price = +tariff.calculatePrice(taxiRide);
        }
        return price;
    }

    public void addRide(TaxiRide taxiRide) {
        taxiRides.add(taxiRide);
    }
}
