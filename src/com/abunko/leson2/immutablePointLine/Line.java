package com.abunko.leson2.immutablePointLine;

/**
 * Created by Andrew on 15.07.2017.
 */
public final class Line {
    private final Point start;
    private final Point end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        Line line = new Line(new Point(2, 4), new Point(4, 1));
        System.out.printf("%f", line.getLength());
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
