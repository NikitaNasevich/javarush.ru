package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        while (fileReader.available() > 0) {
            int num = fileReader.read();
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        Collections.sort(list);

        for (Integer n : list) {
            System.out.print(n + " ");
        }

        reader.close();
        fileReader.close();
    }
}
