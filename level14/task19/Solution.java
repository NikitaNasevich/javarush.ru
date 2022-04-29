package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] a = new int[5];
            int b = a[5];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] a = new int[-1];

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String a = "asdf";
            char b = a.charAt(4);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try{
           throw new ArrayStoreException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            throw new ClassCastException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            throw new NullPointerException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            throw new IllegalArgumentException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            throw new IllegalMonitorStateException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try{
            throw new IllegalStateException();
        } catch (Exception e){
            exceptions.add(e);
        }
    }


}
