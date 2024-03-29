package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            Object a = objectStream.readObject();
            if (!a.getClass().getSimpleName().equals("A")) {
                return null;
            }
            A a1 = (A) a;
            return a1;
        } catch (IOException e) {
            System.out.println("not A");
            return null;
        } catch (Exception e) {
            System.out.println("not A");
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
