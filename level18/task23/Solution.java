package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        while (!fileName.equals("exit")) {
            new ReadThread(fileName).start();
            fileName = bufferedReader.readLine();
        }

        bufferedReader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;

        }

        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            long[] symbols = new long[256];

            try {
                FileReader fileReader = new FileReader(fileName);

                while (fileReader.ready()) {
                    int read = fileReader.read();
                    symbols[read]++;
                }

                fileReader.close();

            } catch (IOException e) {
            }

            long max = 0;
            Integer result = 0;

            for (int i = 0; i < symbols.length; i++) {
                if (max < symbols[i]) {
                    max = symbols[i];
                    result = i;
                }
            }

            resultMap.put(fileName, result);

        }
    }
}
