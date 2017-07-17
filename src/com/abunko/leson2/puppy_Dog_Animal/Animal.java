package com.abunko.leson2.puppy_Dog_Animal;

/**
 * Created by Andrew on 17.07.2017.
 */
public class Animal {
    private String name;

    Animal() {
    }

    Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
