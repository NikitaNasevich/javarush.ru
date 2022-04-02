package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Киселев", "Кисель");
        map.put("Соловьев", "Александр");
        map.put("Воробьев", "Дмитрий");
        map.put("Ладышев", "Валентин");
        map.put("Ким", "Чен Ын");
        map.put("Петрович", "Владимир");
        map.put("Насевис", "Никита");
        map.put("Воронько", "Виктор");
        map.put("Маршалов", "Петр");
        map.put("Иванов", "Иван");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> pair: map.entrySet())
        {
            String value = pair.getValue();
            if (value == name){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> pair: map.entrySet())
        {
            String key = pair.getKey();
            if (key == lastName){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
