package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        bufferedReader = new BufferedReader(new FileReader(fileName));

        while (bufferedReader.ready()) {
            String read = bufferedReader.readLine();

            String[] text = read.split(" ");

            String id = text[0];

            if (id.equals(args[0])) {
                System.out.println(read);
            }

        }

        bufferedReader.close();

    }
}
