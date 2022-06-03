package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = "";
        String fileName2 = "";
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        } catch (IOException e) {
        }

        FileReader fileReader1 = null;
        FileReader fileReader2 = null;

        try {
            fileReader1 = new FileReader(fileName1);
            fileReader2 = new FileReader(fileName2);
        } catch (FileNotFoundException e) {
        }

        BufferedReader readerFileLine1 = new BufferedReader(fileReader1);
        BufferedReader readerFileLine2 = new BufferedReader(fileReader2);

        try {
            String text1 = readerFileLine1.readLine();

            while (text1 != null) {
                allLines.add(text1);
                text1 = readerFileLine1.readLine();
            }
        } catch (IOException e) {
        }

        try {
            String text2 = readerFileLine2.readLine();

            while (text2 != null) {
                forRemoveLines.add(text2);
                text2 = readerFileLine2.readLine();
            }
        } catch (IOException e) {
        }
        try {
            reader.close();
        } catch (IOException e) {
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {

        }
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
