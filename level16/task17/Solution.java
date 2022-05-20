package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                while (numSeconds > 0) {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                }
                System.out.print("Марш!");

            } catch (Exception e) {
                while (numSeconds > 0) {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                System.out.println("Прервано!");
            }
        }
    }
}
