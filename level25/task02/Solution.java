package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.List;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List wheels;

        public Car() {
            //init wheels here
            wheels = new ArrayList();

            String[] wheels = loadWheelNamesFromDB();
            if (wheels.length != 4) {
                throw new IllegalArgumentException();
            }
            for (String s : wheels) {
                this.wheels.add(Wheel.valueOf(s));
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}
