package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Паволов", "Игорь");
        map.put("Паволов", "Игорь");
        map.put("Паволова", "Кузя");
        map.put("Перлов", "Игорь");
        map.put("Лавров", "Саша");
        map.put("Кузьминов", "Петя");
        map.put("Ильич", "Илья");
        map.put("Неильич", "Дима");
        map.put("Петров", "Ваня");
        map.put("Кузнецов", "Сергей");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
