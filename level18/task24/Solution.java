package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        while (true) {

            try {

                FileReader fileReader = new FileReader(fileName);
                fileName = reader.readLine();
                fileReader.close();

            } catch (FileNotFoundException e) {

                System.out.println(fileName);
                reader.close();
                break;

            }
        }

    }
}