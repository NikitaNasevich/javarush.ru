package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateToPrint = new SimpleDateFormat("dd-MMM-yyyy");

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {

                        if (args[i + 1].equals("м")) {

                            Person person = Person.createMale(args[i], date.parse(args[i + 2]));
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));

                        } else {

                            Person person = Person.createFemale(args[i], date.parse(args[i + 2]));
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));
                        }
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {

                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        if (args[i + 2].equals("м")) {
                            Sex sex = Sex.MALE;
                            allPeople.get(Integer.parseInt(args[i])).setSex(sex);
                        } else {
                            Sex sex = Sex.FEMALE;
                            allPeople.get(Integer.parseInt(args[i])).setSex(sex);
                        }

                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(date.parse(args[i + 3]));
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        System.out.println(person.getName() + " " + person.getSex() + " " + dateToPrint.format(person.getBirthDate()));
                    }
                }
                break;
        }
    }
}
