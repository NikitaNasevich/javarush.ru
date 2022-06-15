package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream truePrintStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        System.setOut(printStream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();

        String[] results = result.split("\\n");

        result = "";

        for (int i = 0; i < results.length; i++) {
            if (i % 2 == 0 && i != 0) {
                result += "JavaRush - курсы Java онлайн\n" + results[i] + "\n";
            } else {
                result += results[i] + "\n";
            }
        }

        System.setOut(truePrintStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
