package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileReader = new FileInputStream(fileName);

        int max = fileReader.read();

        while (fileReader.available() > 0) {
            int read = fileReader.read();
            if (max < read) {
                max = read;
            }
        }

        System.out.println(max);

        reader.close();
        fileReader.close();
    }
}
