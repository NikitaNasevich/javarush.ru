package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static CanFly result;

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        if (string.equals("helicopter")) {
            result = new Helicopter();
        } else if (string.equals("plane")) {
            int numpas = Integer.parseInt(reader.readLine());
            result = new Plane(numpas);
        }
        reader.close();
    }
}
