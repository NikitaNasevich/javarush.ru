package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int temp = number / 100;
        int temp1 = (number - temp * 100) / 10;
        int temp3 = number - temp * 100 - temp1 * 10 ;
        number = temp + temp1 + temp3;
        return number;


    }
}