package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        set.add(15);
        set.add(156);
        set.add(1);
        set.add(155);
        set.add(19);
        set.add(20);
        set.add(215);
        set.add(175);
        set.add(5);
        set.add(49);
        set.add(56);
        set.add(4);
        set.add(9);
        set.add(18);
        set.add(17);
        set.add(16);
        set.add(14);
        set.add(13);
        set.add(12);
        set.add(11);

        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(s -> s > 10);
        return set;
    }

    public static void main(String[] args) {

    }
}
