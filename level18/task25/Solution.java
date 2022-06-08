package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        String way = "";

        if(!fileName.equals("end")) {
            way = fileName.split(".part")[0];
        }

        TreeMap<Integer, String> fileNames = new TreeMap<>();



        while (!fileName.equals("end")) {
            fileNames.put(Integer.parseInt(fileName.split(".part")[1]), fileName);
            fileName = bufferedReader.readLine();
        }
        bufferedReader.close();

        for(Map.Entry<Integer, String> entry: fileNames.entrySet()) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(entry.getValue()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(way));

            while (bufferedInputStream.available() > 0) {
                byte[] text = new byte[bufferedInputStream.available()];
                int num = bufferedInputStream.read(text);
                bufferedOutputStream.write(text, 0, num);
            }

            bufferedInputStream.close();
            bufferedOutputStream.close();
        }


    }
}
