package com.javarush.task.task17.task1711;

public enum Sex {
    MALE("м"),
    FEMALE("ж");

    private String title;

    Sex(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
