package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        while (true) {
            if (a > 0) {
                break;
            } else {
                a = Integer.parseInt(reader.readLine());
            }
        }
        int b = Integer.parseInt(reader.readLine());

        while (true) {
            if (b > 0) {
                break;
            } else {
                b = Integer.parseInt(reader.readLine());
            }
        }

        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println(a);
    }
}
