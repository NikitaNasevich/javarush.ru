package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        Pattern patternDate = Pattern.compile("\\d\\d? \\d\\d? \\d\\d\\d\\d");
        Pattern patternName = Pattern.compile("[а-яА-Я]+[ -][А-Яа-я ]*");

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            Matcher matcherDate = patternDate.matcher(line);
            Matcher matcherName = patternName.matcher(line);

            matcherDate.find();
            String date = matcherDate.group();
            String[] splitDate = date.split(" ");
            String day = String.format("%02d", Integer.parseInt(splitDate[0]));
            String month = String.format("%02d", Integer.parseInt(splitDate[1]));
            date = day + " " + month + " " + splitDate[2];

            matcherName.find();
            String name = matcherName.group().trim();

            Date datePerson = simpleDateFormat.parse(date);

            PEOPLE.add(new Person(name, datePerson));
        }

        bufferedReader.close();

    }
}
