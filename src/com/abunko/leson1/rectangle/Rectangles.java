package com.abunko.leson1.rectangle;

import java.util.ArrayList;

/**
 * Created by Andrew on 13.07.2017.
 */
public class Rectangles {
    ArrayList <Rectangle> rectangleslist = new ArrayList<>();

    public void addRectangle(Rectangle r){
        rectangleslist.add(r);
    }

    public int getSumPerimeterOfAllRectangles(){
        int sumOfPerimeter = 0;

        for (Rectangle r : rectangleslist) {
            sumOfPerimeter += r.getPerimeter();
        }
        return sumOfPerimeter;
    }
}
