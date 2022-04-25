package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String way = reader.readLine();

        Scanner scan = new Scanner(new FileInputStream(way));

        while (scan.hasNext()) {
            int ch = scan.nextInt();
            if (ch % 2 == 0) {
                list.add(ch);
            }
        }

        Collections.sort(list);

        for (Integer number : list) {
            System.out.println(number);
        }

        reader.close();
        scan.close();
    }
}
