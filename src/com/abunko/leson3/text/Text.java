package com.abunko.leson3.text;

import java.util.ArrayList;

/**
 * Created by Andrew on 17.07.2017.
 */
public class Text {
    private ArrayList <Texts>  texts;

    public void addToText(Texts t){
        texts.add(t);
    }

    public void showText(){
        for (Texts t : texts) {
            t.show();
        }
    }
    public boolean isThisZagolovok(Texts t){
        if (t instanceof Zagolovok)
            return true;
        else
            return false;
    }

    public ArrayList<Texts> getTexts() {
        return texts;
    }
}
