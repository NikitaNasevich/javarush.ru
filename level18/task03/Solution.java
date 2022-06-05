package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые частые байты
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

        long max = 0;

        for(int i = 0; i < array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }

        for(int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.print(i + " ");
            }
        }

        reader.close();
        fileReader.close();

    }
}
