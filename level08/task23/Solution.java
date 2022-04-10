package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код

        String[] str;
        String delimeter = "\\b";
        str = string.split(delimeter);

        String result = "";

        for (int i = 0; i < str.length; i++) {
            str[i].trim();
            result += Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1).toLowerCase() + " ";
        }

        result.trim();

        System.out.println(result);
    }


}

