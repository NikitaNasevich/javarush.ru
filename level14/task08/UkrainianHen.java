package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country {

    String country = Country.UKRAINE;

    @Override
    public int getCountOfEggsPerMonth() {
        return 60;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
