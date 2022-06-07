package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);

        int generalQuantity = 0;
        int spaces = 0;

        while (fileReader.ready()) {
            int read = fileReader.read();
            generalQuantity++;
            if (read == 32) {
                spaces++;
            }
        }
        fileReader.close();

        double d = 1.0 * spaces / generalQuantity * 100;
        System.out.printf("%.2f", d);

    }
}
