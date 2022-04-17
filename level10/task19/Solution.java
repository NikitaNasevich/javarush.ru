package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/*
        int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println("Id=" + id + " Name=" + name);

 */
        HashMap<String, Integer> map = new HashMap<>();

        String text = reader.readLine();

        String number = "";
        String string = "";

        while (!text.isEmpty()) {
            number = text;
            text = reader.readLine();
            if (!text.isEmpty()) {
                string = text;
                map.put(string, Integer.parseInt(number));
                text = reader.readLine();
            } else {
                string = " ";
                map.put(string, Integer.parseInt(number));
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            int value = pair.getValue();

            System.out.println(value + " " + key);
        }
    }
}
