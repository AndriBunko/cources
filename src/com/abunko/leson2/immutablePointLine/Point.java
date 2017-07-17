package com.abunko.leson2.immutablePointLine;

/**
 * Created by Andrew on 15.07.2017.
 */
public final class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
