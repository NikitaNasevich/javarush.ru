package com.javarush.task.task19.task1909;

import java.io.*;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileToRead = bufferedReader.readLine();
        String fileToWrite = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileToRead));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite));

        while (reader.ready()) {
            String line = reader.readLine();
            line = line.replace('.', '!');
            writer.write(line);
        }

        reader.close();
        writer.close();
    }
}
