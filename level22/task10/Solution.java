package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String[] s = getTokens("level22.lesson13.task01", ".");
        System.out.println(Arrays.toString(s));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] strings = new String[tokenizer.countTokens()];
        int j = tokenizer.countTokens();
        for (int i = 0; i < j; i++) {
            strings[i] = tokenizer.nextToken();
        }
        return strings;
    }
}
