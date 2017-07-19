package com.abunko.leson3.taxiTarifCalculator;

/**
 * Created by Andrew on 17.07.2017.
 */
public class StandardTariff implements Tariff {

    @Override
    public long calculatePrice(TaxiRide  taxiRide) {
        return 30 + 5 * taxiRide.getDistance() + 2 * taxiRide.getDuration();
    }
}
