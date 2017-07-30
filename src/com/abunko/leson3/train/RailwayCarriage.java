package com.abunko.leson3.train;

/**
 * Created by Andrew on 28.07.2017.
 */
public class RailwayCarriage {
    private boolean isLightOn;

    public RailwayCarriage(){
        int i = (int) (Math.random() * 2);
        if (i == 1) isLightOn = true;
        else isLightOn = false;
    }

    public boolean getIsLightOn(){
        return isLightOn;
    }

    public boolean isLightOn() {
        return isLightOn;
    }


    public void setLightOn(boolean lightOn) {
        isLightOn = lightOn;
    }

    public RailwayCarriage(boolean isLightOn) {
        this.isLightOn = isLightOn;
    }

}
