package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        bufferedReader.close();

        ArrayList<Integer> list = new ArrayList<>();

        FileReader fileReader = new FileReader(fileName1);

        while (fileReader.ready()) {
            list.add(fileReader.read());
        }

        fileReader.close();

        FileWriter fileWriter = new FileWriter(fileName2);

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                fileWriter.write(list.get(i));
            }
        }

        fileWriter.close();
    }
}
