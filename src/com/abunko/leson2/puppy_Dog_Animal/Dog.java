package com.abunko.leson2.puppy_Dog_Animal;

/**
 * Created by Andrew on 17.07.2017.
 */
public class Dog extends Animal {

    Dog() {
    }

    Dog(String name) {
        super(name);
    }

    public void printName() {
        System.out.println(this.getName());
    }

    public void say() {
        System.out.println(this.getName() + " say: Gav-Gav");
    }

    public void bite() {
        System.out.println(this.getName() + " bite");
    }

}
