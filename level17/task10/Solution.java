package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateToPrint = new SimpleDateFormat("dd-MMM-yyyy");
        if (args[0].equals("-c")) {
            if (args[2].equals("м")) {
                Person person = Person.createMale(args[1], date.parse(args[3]));
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            } else {
                Person person = Person.createFemale(args[1], date.parse(args[3]));
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
        } else if (args[0].equals("-r")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            System.out.println(person.getName() + " " + person.getSex() + " " + dateToPrint.format(person.getBirthDate()));
        } else if (args[0].equals("-u")) {
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            if (args[3].equals("м")) {
                Sex sex = Sex.MALE;
                allPeople.get(Integer.parseInt(args[1])).setSex(sex);
            } else {
                Sex sex = Sex.FEMALE;
                allPeople.get(Integer.parseInt(args[1])).setSex(sex);
            }

            allPeople.get(Integer.parseInt(args[1])).setBirthDate(date.parse(args[4]));

        } else if (args[0].equals("-d")) {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);

        }
    }
}