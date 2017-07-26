package com.abunko.leson2.immutablePointLine;

/**
 * Created by Andrew on 15.07.2017.
 */
public final class Line {
    private final Point start;
    private final Point end;

   public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        return Math.sqrt((Math.pow(end.getX() - start.getX(), 2)) + Math.pow(end.getY() - start.getY(), 2));
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

}
