package com.abunko.leson1.palindrome;


import java.util.ArrayList;

/**
 * Created by Andrew on 13.07.2017.
 */
public class Palindromes {
   private ArrayList <Integer> palindromeNumerics = new ArrayList<>();

    public static boolean isNumericPalindrome(int num){
        StringBuilder str = new StringBuilder(Integer.toString(num));

        if (str.toString().equals(str.reverse().toString())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Palindromes numerics : " + palindromeNumerics;
    }


    public void addNumeric(int number){
        if(isNumericPalindrome(number)) palindromeNumerics.add(number);
    }


    public  int getPalindromeNumericOfIndex(int index) throws  Exception{
        return palindromeNumerics.get(index);
    }


    public ArrayList <Integer> getAllPalindromeNumerics(){
        return  palindromeNumerics;
    }
}
