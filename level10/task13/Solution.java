package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private boolean sex;
        private int weight;
        private String name;
        private boolean parents;
        private int kids;

        public Human(){
        }

        public Human(int age){
            this.age = age;
        }
        public Human(boolean sex){
            this.sex = sex;
        }
        public Human(String name){
            this.name = name;
        }
        public Human(int age, String name){
            this.age = age;
            this.name = name;
        }
        public Human(int age, boolean sex){
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, int weight){
            this.name = name;
            this.weight = weight;
        }
        public Human(boolean parents, int kids){
            this.parents = parents;
            this.kids = kids;
        }
        public Human(int age, int weight){
            this.age = age;
            this.weight =weight;
        }
        public Human(boolean sex, String name){
            this.sex = sex;
            this.name = name;
        }
    }
}
