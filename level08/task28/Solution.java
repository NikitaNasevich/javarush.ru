package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String month = whichMonth();
        showAnswer(numberOfMonth(month), month);


    }
    private static ArrayList<String> createMonths(){
        ArrayList<String> months = new ArrayList<>(12);
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        return months;
    }

    private static int numberOfMonth(String month){
       int number = 0;
        for(String checkMonth: createMonths()){
           if(month.equals(checkMonth)){
               number = createMonths().indexOf(checkMonth);
           }
       }
       return number;
    }

    private static String whichMonth() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        return month;
    }

    private static void showAnswer(int number, String name){
        number += 1;
        System.out.println(name + " is the " + number + " month");
    }
}
