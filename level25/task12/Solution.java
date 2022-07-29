package com.javarush.task.task25.task2512;

import java.util.ArrayList;

/* 
Живем своим умом
*/

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        ArrayList<Throwable> throwables = new ArrayList<>();

        Throwable th = e.getCause();
        if (th != null) {
            while (th != null) {
                throwables.add(th);
                th = th.getCause();
            }
        }
        for (int i = throwables.size() - 1; i >= 0; i--) {
            System.out.println(throwables.get(i));
        }
        System.out.println(e.getClass().getName() + ": " + e.getMessage());

    }

    public static void main(String[] args) {
//        new Solution().uncaughtException(new Thread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
