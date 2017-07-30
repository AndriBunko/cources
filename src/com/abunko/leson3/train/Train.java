package com.abunko.leson3.train;

/**
 * Created by Andrew on 28.07.2017.
 */
public interface Train {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
