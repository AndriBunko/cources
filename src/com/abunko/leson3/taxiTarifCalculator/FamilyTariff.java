package com.abunko.leson3.taxiTarifCalculator;

/**
 * Created by Andrew on 17.07.2017.
 */
public class FamilyTariff implements Tariff {

    @Override
    public long calculatePrice(TaxiRide taxiRide) {
        return 50 + 20 * taxiRide.getDistance() / taxiRide.getPassengers();
    }
}
