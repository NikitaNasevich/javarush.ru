package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder("");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String value = entry.getValue();
            if (value != null) {
                if (builder.length() < 1) {
                    builder.append(entry.getKey()).append(" = '").append(value).append("'");
                } else {
                    builder.append(" and ").append(entry.getKey()).append(" = '").append(value).append("'");
                }
            }
        }
        return builder.toString();
    }
}
