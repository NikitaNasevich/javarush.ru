package com.javarush.task.task26.task2601;

/*
Почитать в инете про медиану выборки
*/

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
//        Integer[] array = new Integer[]{13, 9, 15, 5, 17};
//        Integer[] ar = sort(array);
//        System.out.println(Arrays.toString(ar));

    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        Integer[] ar = array.clone();
        Arrays.sort(ar);

        Integer mediane = getMediane(ar);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer result = Math.abs(o1 - mediane) - Math.abs(o2 - mediane);
                if (result == 0) {
                    return o1 - o2;
                } else {
                    return result;
                }
            }
        };

        Arrays.sort(ar, comparator);

        return ar;
    }

    private static Integer getMediane(Integer[] array) {
        if (array.length % 2 == 0) {
            return (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        } else {
            return array[array.length / 2];
        }
    }
}
