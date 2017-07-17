package com.abunko.leson2.puppy_Dog_Animal;

/**
 * Created by Andrew on 17.07.2017.
 */
public class Puppy extends Dog {

    Puppy() {
    }

    Puppy(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.getName() + " run");
    }

    public void jump() {
        System.out.println(this.getName() + " jump");
    }
}
