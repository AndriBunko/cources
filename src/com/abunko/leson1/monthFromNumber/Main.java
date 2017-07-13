package com.abunko.leson1.monthFromNumber;

import java.util.Scanner;

/**
 * Created by Andrew on 13.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Для выхода нажмите 0");

        int numOfMonth = readNumOfMonth();

        while (numOfMonth != 0) {
            try {
                Month m = Month.of(numOfMonth);
                System.out.println(m);
            }catch (Exception e){
                System.out.println(e);
            }
                numOfMonth = readNumOfMonth();
        }
    }


    public static int readNumOfMonth(){
        System.out.println("Введите номер месяца");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

