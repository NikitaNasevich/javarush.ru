package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int cout = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1 && a[i][j] == 1) {
                    checkAndMarkHoriz(a, i, j);
                    cout++;
                }
            }

        }

        return cout;
    }

    private static void checkAndMarkHoriz(byte[][] a, int x, int start) {
        for (int i = start; i < a[x].length; i++) {
            if (a[x][i] == 1) {
                a[x][i] = 0;
                checkAndMarkVert(a, x + 1, i);
            } else if (a[x][i] == 0) {
                break;
            }
        }
    }

    private static void checkAndMarkVert(byte[][] a, int x, int start) {
        for (int i = x; i < a.length; i++) {
            if (a[i][start] == 1) {
                a[i][start] = 0;
            } else if (a[x][i] == 0) {
                break;
            }
        }
    }
}
