package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution s1 = new Solution();
        Solution s2 = new Solution();
        InnerClass s11 = s1.new InnerClass();
        InnerClass s12 = s1.new InnerClass();
        InnerClass s21 = s2.new InnerClass();
        InnerClass s22 = s2.new InnerClass();

        s1.innerClasses[0] = s11;
        s1.innerClasses[1] = s12;
        s2.innerClasses[0] = s21;
        s2.innerClasses[1] = s22;

        return new Solution[]{s1, s2};
    }

    public static void main(String[] args) {

    }
}
