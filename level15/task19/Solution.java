package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        while (true) {
            if (line.equals("exit")) {
                break;
            }

            try {
                int n = Integer.parseInt(line);
                if (n > 0 && n < 128) {
                    print((short) n);
                } else {
                    print(n);
                }
            } catch (Exception e) {
                try {
                    print(Double.parseDouble(line));
                } catch (Exception e1) {
                    print(line);
                }
            }
            line = reader.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
