package com.abunko.leson3.train;

import java.util.ArrayList;

/**
 * Created by Anrew on 28.07.2017.
 */
public class TrainImplementation implements Train{
    private final int length = (int) (Math.random() * 100);
    private int position = (int) (Math.random() * length);
    private final ArrayList<RailwayCarriage> railwayCarriages = new ArrayList<>();

    public TrainImplementation(){
        for (int i = 0; i < length ; i++){
            railwayCarriages.add(i, new RailwayCarriage());
        }
    }


    @Override
    public void turnLeft() {
        if (position > 0){
            position --;
        }
        else {
            position = length - 1;
        }
    }

    @Override
    public void turnRight() {
        if (position < length -1  ){
            position ++;

        }
        else {
            position = 0;
        }
    }

    @Override
    public void lightOn() {

        railwayCarriages.get(position).setLightOn(true);
    }

    @Override
    public void lightOff() {
        railwayCarriages.get(position).setLightOn(false);
    }

    @Override
    public boolean isLightOn() {
        return  railwayCarriages.get(position).getIsLightOn();
    }

    @Override
    public boolean isLength(int expectedLength) {
        return  expectedLength == this.length ? true : false;
    }

    public int getLengs() {
        return length;
    }
}
