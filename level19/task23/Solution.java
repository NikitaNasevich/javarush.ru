package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();

            Matcher matcher = Pattern.compile("\\S*\\d+\\S*").matcher(line);
            while (matcher.find()) {
                bufferedWriter.write(matcher.group() + " ");
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
