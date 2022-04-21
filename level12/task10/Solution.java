package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int max(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public static long max(long first, long second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public static double max(double first, double second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }
}
