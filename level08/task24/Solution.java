package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfather1 = new Human();
        Human grandfather2 = new Human();
        Human grandmother1 = new Human();
        Human grandmother2 = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human kid1 = new Human();
        Human kid2 = new Human();
        Human kid3 = new Human();

        grandfather1.name = "Аркадий";
        grandfather1.age = 75;
        grandfather1.sex = true;
        grandfather1.children.add(father);

        grandmother1.name = "Зинаида";
        grandmother1.age = 68;
        grandmother1.sex = false;
        grandmother1.children.add(father);

        grandfather2.name = "Сергей";
        grandfather2.age = 74;
        grandfather2.sex = true;
        grandfather2.children.add(mother);

        grandmother2.name = "Василина";
        grandmother2.age = 62;
        grandmother2.sex = false;
        grandmother2.children.add(mother);

        father.name = "Ярослав";
        father.age = 35;
        father.sex = true;
        father.children.add(kid1);
        father.children.add(kid2);
        father.children.add(kid3);

        mother.name = "Мила";
        mother.age = 29;
        mother.sex = false;
        mother.children.add(kid1);
        mother.children.add(kid2);
        mother.children.add(kid3);

        kid1.name = "Павел";
        kid1.age = 12;
        kid1.sex = true;

        kid2.name = "Андрей";
        kid2.age = 22;
        kid2.sex = true;

        kid3.name = "Никита";
        kid3.age = 28;
        kid3.sex = true;

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
