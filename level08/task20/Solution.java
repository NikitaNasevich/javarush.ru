package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<>();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        result.add(dog1);
        result.add(dog2);
        result.add(dog3);

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
       Set<Object> catsAndDogs = new HashSet();
       catsAndDogs.addAll(cats);
       catsAndDogs.addAll(dogs);

        return catsAndDogs;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object> copyPets = new HashSet<>(pets);

        for(Object check: copyPets){
            for(Cat cat: cats){
                if(check.equals(cat)){
                    pets.remove(check);
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for(Object ob: pets){
            System.out.println(ob);
        }
    }

    //напишите тут ваш код
    public static class Dog{}

    public static class Cat{}
}
