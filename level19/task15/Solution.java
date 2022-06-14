package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        PrintStream truePrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        testString.printSomething();

        String text = byteArrayOutputStream.toString();
        fileOutputStream.write(text.getBytes());
        fileOutputStream.close();

        System.setOut(truePrintStream);
        System.out.println(text);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

