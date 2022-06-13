package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream truePrintStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        System.setOut(printStream);

        testString.printSomething();

        String result = changeTE(byteArrayOutputStream.toString());

        System.setOut(truePrintStream);

        System.out.println(result);
    }

    private static String changeTE(String text) {
        text = text.replace("te", "??");
        return text;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
