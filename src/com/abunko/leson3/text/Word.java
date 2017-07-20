package com.abunko.leson3.text;

/**
 * Created by Andrew on 17.07.2017.
 */
public  class Word implements Texts{
   private String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public void show() {
        System.out.println(word + " ");
    }
}
