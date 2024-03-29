package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();


    static {
        try {
            File file = new File(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
