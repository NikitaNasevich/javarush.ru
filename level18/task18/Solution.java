package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileReader fileReader1 = new FileReader(fileName2);
        FileReader fileReader2 = new FileReader(fileName3);
        FileWriter fileWriter = new FileWriter(fileName1);

        while (fileReader1.ready()) {
            fileWriter.write(fileReader1.read());
        }

        fileWriter = new FileWriter(fileName1, true);

        while (fileReader2.ready()) {
            fileWriter.write(fileReader2.read());
        }

        reader.close();
        fileReader1.close();
        fileReader2.close();
        fileWriter.close();


    }
}
