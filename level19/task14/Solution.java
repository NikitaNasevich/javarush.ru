package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream truePrintStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        System.setOut(printStream);

        testString.printSomething();

        String result = resultOperation(byteArrayOutputStream.toString());

        System.setOut(truePrintStream);

        System.out.println(result);
    }

    private static String resultOperation(String text) {
        text = text.trim();
        Pattern p = Pattern.compile("[0-9]+");
        Pattern sign = Pattern.compile("[+*-]");
        Matcher m = p.matcher(text);
        Matcher m1 = sign.matcher(text);
        m.find();
        int first = Integer.parseInt(m.group());
        m.find();
        int second = Integer.parseInt(m.group());
        m1.find();
        String check = m1.group();

        int result = 0;

        switch (check) {
            case ("+"):
                result = first + second;
                break;
            case ("-"):
                result = first - second;
                break;
            case ("*"):
                result = first * second;
                break;
        }

        return text + " " + result;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

