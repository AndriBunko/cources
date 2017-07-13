package com.abunko.leson1.palindrome;

import com.abunko.leson1.palindrome.Palindromes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrew on 13.07.2017.
 */
public class Main{
   private static int arrSize ;
   private static int [] arr ;
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Palindromes p = new Palindromes();

        readCountOfNum();
        readNumerics();

        for (int i : arr){ p.addNumeric(i);}
        System.out.println(p);
    }


    public static void readCountOfNum(){
        System.out.println("Введите количество чисел");
        arrSize = scanner.nextInt();
        }


    public static void readNumerics(){
        arr = new int[arrSize];
        System.out.println("Введите числа");
        for (int i = 0; i < arrSize; i++ ) {
            arr[i] = scanner.nextInt();
        }
    }

}


