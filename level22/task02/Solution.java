package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        try {
            String[] strings = string.split(" ");
            String result = "";
            if (strings.length < 5) {
                throw new TooShortStringException();
            }
            for (int i = 1; i < 5; i++) {
                result += strings[i] + " ";
            }

            return result.trim();
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
