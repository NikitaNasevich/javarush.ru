package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(name1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(name2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(name3);

        byte[] text = new byte[fileInputStream.available()];

        if (fileInputStream.available() > 0) {
            int tryLength = fileInputStream.read(text);

            if (tryLength % 2 == 0) {
                fileOutputStream1.write(text, 0, tryLength / 2);
                fileOutputStream2.write(text, tryLength / 2, tryLength / 2);
            } else {
                fileOutputStream1.write(text, 0, (tryLength / 2) + 1);
                fileOutputStream2.write(text, (tryLength / 2) + 1, tryLength / 2);
            }
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
