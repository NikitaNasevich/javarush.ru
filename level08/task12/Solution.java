package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(Integer.parseInt(reader.readLine()));
        }
        int temp = 1;
        int count = 0;
        for (int i = 0; i < 9; i++) {

            if (list.get(i).equals(list.get(i + 1))) {
                temp++;
            } else {
                if (temp > count) {
                    count = temp;
                    temp = 1;
                } else {
                    temp = 1;
                }
            }
            if (i == 8) {
                if (temp > count) {
                    count = temp;
                } else {
                    temp = 1;
                }
            }
        }
        System.out.println(count);
    }
}

