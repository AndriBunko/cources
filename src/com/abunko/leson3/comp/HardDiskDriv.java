package com.abunko.leson3.comp;

/**
 * Created by Andrew on 20.07.2017.
 */
public class HardDiskDriv {
    private final int size;

    public HardDiskDriv(int size) {
        this.size = size;
    }

    public void off() {
        System.out.println("HDD выключен");
    }

    public void run() {
        System.out.println("HDD запущен");
    }

    public int getSize() {
        return size;
    }

}
