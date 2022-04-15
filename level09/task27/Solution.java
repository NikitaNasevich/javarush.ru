package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        Cat cat1 = new Cat("Васька");
        Cat cat2 = new Cat("Маська");
        Cat cat3 = new Cat("Моська");
        Cat cat4 = new Cat("Зоська");
        Cat cat5 = new Cat("Авоська");
        Cat cat6 = new Cat("Папоська");
        Cat cat7 = new Cat("Мамоська");
        Cat cat8 = new Cat("Картоська");
        Cat cat9 = new Cat("Малоська");
        Cat cat10 = new Cat("Жутёська");

        map.put(cat1.name, cat1);
        map.put(cat2.name, cat2);
        map.put(cat3.name, cat3);
        map.put(cat4.name, cat4);
        map.put(cat5.name, cat5);
        map.put(cat6.name, cat6);
        map.put(cat7.name, cat7);
        map.put(cat8.name, cat8);
        map.put(cat9.name, cat9);
        map.put(cat10.name, cat10);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cat = new HashSet<>(map.values());

        return cat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
