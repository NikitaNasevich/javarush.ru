package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int min = Collections.min(array);

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(reader.readLine());

        List<Integer> num = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            num.add(Integer.parseInt(reader.readLine()));
        }

        return num;
    }
}
