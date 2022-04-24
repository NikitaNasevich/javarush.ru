package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        boolean check = true;
        while (check) {
            String read = reader.readLine();

            if (read.equals("exit")) {
                check = false;
                writer.write(read);
                writer.flush();

            } else {

                writer.write(read + "\n");
                writer.flush();

            }
        }

        reader.close();
        writer.close();

    }
}