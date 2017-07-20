package com.abunko.leson3.comp;

/**
 * Created by Andrew on 20.07.2017.
 */
public class Comp {
    private Procesor procesor;
    private HardDiskDriv hdd;
    private CDRom cdRom;
    private RandomAccessMemory randomAccessMemory;

    public Comp(Procesor procesor, HardDiskDriv hdd, CDRom cdRom, RandomAccessMemory randomAccessMemory) {
        this.procesor = procesor;
        this.hdd = hdd;
        this.cdRom = cdRom;
        this.randomAccessMemory = randomAccessMemory;
    }

    public void turnOn(){
        this.getProcesor().run();
        this.getRandomAccessMemory().run();
        this.getHdd().run();
        this.getCdRom().run();
        System.out.println("компютер включился");
    }
    public void turnOff(){
        this.getCdRom().off();
        this.getHdd().off();
        this.getRandomAccessMemory().off();
        this.getProcesor().off();
        System.out.println("компютер выключен");
    }

    public void virus(){
        System.out.println("Проверка на вирусы");
    }

    public void printSizeHDD(){
        System.out.println(this.getHdd().getSize());
    }


    public Procesor getProcesor() {
        return procesor;
    }

    public HardDiskDriv getHdd() {
        return hdd;
    }

    public CDRom getCdRom() {
        return cdRom;
    }

    public RandomAccessMemory getRandomAccessMemory() {
        return randomAccessMemory;
    }
}
