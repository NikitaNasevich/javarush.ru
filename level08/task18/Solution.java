package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 600);
        map.put("Иванова", 400);
        map.put("Смирнов", 700);
        map.put("Кравчук", 650);
        map.put("Тунец", 300);
        map.put("Сободаш", 100);
        map.put("Кузнецова", 1600);
        map.put("Воронович", 600);
        map.put("Телешов", 600);
        map.put("Кузьмин", 600);

        return map;

    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> map1 = new HashMap<>(map);

        for(Map.Entry<String, Integer> pair: map1.entrySet()){
            if(pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}