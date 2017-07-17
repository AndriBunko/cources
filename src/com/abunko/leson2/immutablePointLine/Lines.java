package com.abunko.leson2.immutablePointLine;

import java.util.ArrayList;

/**
 * Created by Andrew on 15.07.2017.
 */
public class Lines {
    private ArrayList<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public double sumLength() {
        double sum = 0;

        for (Line line : lines) {
            sum += line.getLength();
        }
        return sum;
    }

    public Line longestLine() {
        Line longestLine = null;
        double length = 0;

        for (Line line : lines) {
            if (length > line.getLength()) {
                length = line.getLength();
                longestLine = line;
            }
        }
        return longestLine;
    }
}

