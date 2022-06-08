package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (fileReader.ready()) {
            int read = fileReader.read();

            if (map.containsKey(read)) {
                map.put(read, map.get(read) + 1);
            } else {
                map.put(read, 1);
            }
        }

        fileReader.close();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            System.out.println(((char) key) + " " + entry.getValue());
        }

    }
}
