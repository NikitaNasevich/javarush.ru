package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new FileReader(fileName));

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String reverseLine = new StringBuilder(line).reverse().toString();
            System.out.println(reverseLine);
        }

        bufferedReader.close();
    }
}
