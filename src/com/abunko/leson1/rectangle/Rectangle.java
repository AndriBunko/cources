package com.abunko.leson1.rectangle;

/**
 * Created by Andrew on 13.07.2017.
 */
public class Rectangle {
    private int height;
    private int width;

    Rectangle(int height, int width){
        this.height = height;
        this.width =  width;
    }

    public int getPerimeter(){
        return height*2 + width*2;
    }

    public int getSquare(){
        return width * height;
    }

}
