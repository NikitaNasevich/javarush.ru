package com.javarush.task.task08.task0827;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        System.out.print(date + " = ");
        Calendar dateFromString = new GregorianCalendar();
        Calendar newYear = new GregorianCalendar();

        DateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy");
        Date dt = dateFormat.parse(date);
        dt.setHours(23);
        dt.setMinutes(59);
        dt.setSeconds(59);
        dateFromString.setTime(dt);

        newYear.set(dateFromString.get(Calendar.YEAR), 0, 1, 0, 0, 0);

        Date d1 = dateFromString.getTime();
        Date d2 = newYear.getTime();

        long ms = d1.getTime() - d2.getTime();

        int days = (int)(ms / (1000 * 60 * 60 * 24)) + 1;

        if(days == 0){
            return true;
        } else if(days % 2 == 0) {
        return false;
    } else {
            return true;
        }
}
}
