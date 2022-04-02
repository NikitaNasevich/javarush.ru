package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        //напишите тут ваш код

        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Соболев", dateFormat.parse("AUGUST 1 2012"));
        map.put("Пушкин", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Рамзан", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Путило", dateFormat.parse("JANUARY 1 2012"));
        map.put("Живов", dateFormat.parse("JULY 1 2012"));
        map.put("Беляшов", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Петечкин", dateFormat.parse("MARCH 1 2012"));
        map.put("Никитин", dateFormat.parse("APRIL 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Map<String, Date> map1 = new HashMap<>(map);

        for(String key: map1.keySet()){
            Date date = map1.get(key);
            int month = date.getMonth() + 1;
            if(month == 6 || month == 7 || month == 8){
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
