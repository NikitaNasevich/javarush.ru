package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> others = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char check = string.charAt(i);
            if (isVowel(check)) {
                vowel.add(check);
            } else if (check != ' ') {
                others.add(check);
            }
        }

        for (int i = 0; i < vowel.size(); i++) {
            System.out.print(Character.toChars(vowel.get(i)));
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < others.size(); i++) {

            System.out.print((Character.toChars(others.get(i))));
            System.out.print(" ");

        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}