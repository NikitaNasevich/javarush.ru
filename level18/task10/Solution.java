package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        while (true) {
            byte[] text = new byte[fileInputStream.available()];
            int check = fileInputStream.read(text);

            if (check < 1000) {
                break;
            }

            fileInputStream = new FileInputStream(reader.readLine());

        }

        reader.close();
        fileInputStream.close();

        throw new DownloadException();
    }

    public static class DownloadException extends Exception {

    }
}
