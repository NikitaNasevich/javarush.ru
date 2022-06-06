package com.javarush.task.task18.task1809;

import java.io.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(name1);
        FileOutputStream fileOutputStream = new FileOutputStream(name2);

        byte[] text = new byte[fileInputStream.available()];
        int quantity = 0;

        if (fileInputStream.available() > 0) {
            quantity = fileInputStream.read(text);
        }

        byte[] textToOut = new byte[text.length];

        for (int i = 0; i < text.length; i++) {
            if (text[text.length - i - 1] != 0) {
                textToOut[i] = text[text.length - i - 1];
            }
        }


        fileOutputStream.write(textToOut, 0 , quantity);

        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
