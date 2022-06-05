package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileReader = new FileInputStream(fileName);

        long[] array = new long[256];

        while (fileReader.available() > 0) {
            array[fileReader.read()]++;
        }

        long min = 100000;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i] && array[i] != 0) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }

        reader.close();
        fileReader.close();
    }
}
