package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat fromDate = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat toDate = new SimpleDateFormat("MMM dd, yyyy");

        Date date = fromDate.parse(reader.readLine());
        System.out.println(toDate.format(date).toUpperCase(Locale.ROOT));
    }
}
