package com.javarush.task.task19.task1908;

import java.io.*;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //NumberFormatException
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileToRead = reader.readLine();
        String fileToWrite = fileToRead;
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileToRead));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite));

        while (reader1.ready()) {
            String[] line = reader1.readLine().split(" ");

            for (String check : line) {
                try {
                    int isNum = Integer.parseInt(check);
                    writer.write(check + " ");
                } catch (NumberFormatException e) {
                }
            }
        }

        reader1.close();
        writer.close();

    }
}
