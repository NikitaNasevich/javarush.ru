package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] cutLine = line.split(" ");
            String dateStr = line.substring(line.length() - 11);
            SimpleDateFormat dataFormat = new SimpleDateFormat("dd MM yyyy");
            Date date = null;
            try {
                date = dataFormat.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person person = new Person(cutLine[1], cutLine[2], cutLine[0], date);

            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
