package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String way = reader.readLine();

        InputStream inputStream = new FileInputStream(way);

        while(inputStream.available() > 0){
            int data = inputStream.read();
            System.out.print((char) data);
        }


        reader.close();
        inputStream.close();



    }
}