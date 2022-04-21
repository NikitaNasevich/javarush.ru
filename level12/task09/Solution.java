package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int first, int second) {
        if (first > second) {
            return second;
        } else {
            return first;
        }
    }

    public static long min(long first, long second) {
        if (first > second) {
            return second;
        } else {
            return first;
        }
    }

    public static double min(double first, double second) {
        if (first > second) {
            return second;
        } else {
            return first;
        }
    }
}
