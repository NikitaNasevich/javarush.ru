package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException{
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       String fileName1 = bufferedReader.readLine();
       String fileName2 = bufferedReader.readLine();

       FileReader fileReader = new FileReader(fileName1);
       FileWriter fileWriter = new FileWriter(fileName2);
       bufferedReader = new BufferedReader(fileReader);

       String readText = bufferedReader.readLine();

       String[] numbers = readText.split(" ");

       for(String result: numbers) {
          int resultNumber = (int) Math.round(Double.parseDouble(result));
          String resultToWrite = Integer.toString(resultNumber);

          fileWriter.write(resultToWrite + " ");
       }

       bufferedReader.close();
       fileReader.close();
       fileWriter.close();
    }
}
