package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        int del = 0;
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '?') {
                del = i;
            }
        }

        String substring = url.substring(del + 1, url.length() - 1);
        String[] strings = substring.split("&");

        String al = null;
        for (int i = 0; i < strings.length; i++) {
            String[] sub = strings[i].split("=");
            if (sub[0].equals("obj")) {
                System.out.print(sub[0] + " ");
                al = sub[1];
            } else {
                System.out.print(sub[0] + " ");
            }
        }
        if (al != null) {
            try {
                System.out.println();
                alert(Double.parseDouble(al));
            } catch (Exception e) {
                System.out.println();
                alert(al);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
