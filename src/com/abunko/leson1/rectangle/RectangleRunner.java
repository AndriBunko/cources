package com.abunko.leson1.rectangle;

/**
 * Created by Andrew on 13.07.2017.
 */
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(4, 4);

        System.out.println("Периметр r1 = "  + r1.getPerimeter() + ";");
        System.out.println("Периметр r2 = "  + r2.getPerimeter() + ";");
        System.out.println();

        System.out.println("Площадь r1 = " + r1.getSquare() + ";");
        System.out.println("Площадь r2 = " + r2.getSquare() + ";");
        System.out.println();

        Rectangles listRectangles = new Rectangles();

        listRectangles.addRectangle(r1);
        listRectangles.addRectangle(r2);

        System.out.println("Cуммарная площадь = " + listRectangles.getSumPerimeterOfAllRectangles() + ".");
    }
}
