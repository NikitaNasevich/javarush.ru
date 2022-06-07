package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        boolean append = false;

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileInputStream fileInputStream1 = new FileInputStream(fileName2);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1, append);

        byte[] textFromFile1 = new byte[fileInputStream.available()];
        int quantityFile1 = 0;

        if (fileInputStream.available() > 0) {
            quantityFile1 = fileInputStream.read(textFromFile1);
        }

        byte[] textFromFile2 = new byte[fileInputStream1.available()];
        int quantityFile2 = 0;

        if (fileInputStream1.available() > 0) {
            quantityFile2 = fileInputStream1.read(textFromFile2);
        }
        fileInputStream.close();
        fileInputStream1.close();

        fileOutputStream.write(textFromFile2, 0, quantityFile2);

        append = true;

        fileOutputStream.write(textFromFile1, 0, quantityFile1);

        bufferedReader.close();

        fileOutputStream.close();
    }
}
