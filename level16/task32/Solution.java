package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        Thread5 thread5 = new Thread5();


        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);

    }

    public static void main(String[] args) throws InterruptedException {

    }


}

class Thread1 extends Thread {
    public void run() {
        while (true) {
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            sleep(0);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Ура");
            try {
                sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }
}

class Thread4 extends Thread implements Message {
    boolean check = true;

    @Override
    public void showWarning() {
        check = false;
    }

    public void run() {

        try {
            while (check) {
            }
        } catch (Exception e) {

        }
    }
}

class Thread5 extends Thread {
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        try {
            String read = reader.readLine();
            while (!read.equals("N")) {
                sum += Integer.parseInt(read);
                read = reader.readLine();
            }
            System.out.println(sum);
        } catch (Exception e) {
        }


    }
}