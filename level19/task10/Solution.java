package com.javarush.task.task19.task1910;

import java.io.*;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileToRead = bufferedReader.readLine();
        String fileToWrite = bufferedReader.readLine();

        bufferedReader.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileToRead)); BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite))) {

            while (reader.ready()) {
                String line = reader.readLine();
                line = line.replaceAll("(?U)[\\pP\\n]", "");
                writer.write(line);
            }
        } catch (Exception e) {

        }
    }
}
