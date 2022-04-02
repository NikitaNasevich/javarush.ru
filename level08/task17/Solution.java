package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Киселев", "Кисель");
        map.put("Соловьев", "Александр");
        map.put("Воробьев", "Виктор");
        map.put("Ладышев", "Валентин");
        map.put("Ким", "Чен Ын");
        map.put("Петрович", "Владимир");
        map.put("Насевис", "Никита");
        map.put("Воронько", "Виктор");
        map.put("Маршалов", "Кисель");
        map.put("Иванов", "Иван");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> ar = new ArrayList<>();

        int count = 0;
        for(Map.Entry<String, String> pair: map.entrySet()){
            String value = pair.getValue();
                for(Map.Entry<String, String> pair1: map.entrySet()){
                String value1 = pair1.getValue();
                if(value1.equals(value)){
                    count++;
                }
            }
            if(count > 1){
                ar.add(value);
                count = 0;
            }
            count = 0;
        }
        for(String delValue: ar){
            removeItemFromMapByValue(map, delValue);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
