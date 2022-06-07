package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int quantity = 0;
        while (fileInputStream.available() > 0) {
            int read = fileInputStream.read();
            if (read > 64 && read < 91 || read > 96 && read < 123) {
                quantity++;
            }
        }

        System.out.println(quantity);
        fileInputStream.close();
    }
}
