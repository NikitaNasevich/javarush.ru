package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        bufferedReader = new BufferedReader(new FileReader(fileName));

        String line = "";
        int quantity = 0;


        while (bufferedReader.ready()) {
            line = bufferedReader.readLine();
            if (line.contains("world")) {
                String[] numbers = line.split("[\\s,.!?]+");
                quantity += counter(numbers, "world");
            }
        }

        System.out.println(quantity);
        bufferedReader.close();
    }

    private static int counter(String[] str, String word) {
        int count = 0;
        for (String check : str) {
            if (check.equals(word)) {
                count++;
            }
        }

        return count;
    }
}
