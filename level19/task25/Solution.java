package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> checkedWords = new ArrayList<>();

        while (bufferedReader.ready()) {
            String[] words = bufferedReader.readLine().split(" ");
            for (String word : words) {
                if (word.length() > 6) {
                    checkedWords.add(word);
                }
            }
        }

        bufferedReader.close();

        for (int i = 0; i < checkedWords.size(); i++) {
            if (i < checkedWords.size() - 1) {
                bufferedWriter.write(checkedWords.get(i) + ",");
            } else {
                bufferedWriter.write(checkedWords.get(i));
            }
        }

        bufferedWriter.close();
    }
}
