package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Horse getWinner() {
        double max = horses.get(0).getDistance();
        int winnerIndex = 0;
        for (Horse horse : horses) {
            if (horse.getDistance() > max) {
                max = horse.getDistance();
                winnerIndex = horses.indexOf(horse);
            }
        }
        return horses.get(winnerIndex);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(new Horse("Кабыла1", 3, 0));
        horses.add(new Horse("Кабыла2", 3, 0));
        horses.add(new Horse("Кабыла3", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }


}
