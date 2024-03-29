package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileInputStream f = new FileInputStream(args[0]);
        FileOutputStream w = new FileOutputStream(args[1])) {

            Charset windows1251 = Charset.forName("Windows-1251");
            Charset utf8 = Charset.forName("UTF-8");

            byte[] bytes = new byte[f.available()];

            int length = f.read(bytes);

            String s = new String(bytes, windows1251);

            bytes = s.getBytes(utf8);

            w.write(bytes);

        }
    }
}
