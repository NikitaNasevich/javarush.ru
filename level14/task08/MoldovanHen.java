package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {

    String country = Country.MOLDOVA;

    @Override
    public int getCountOfEggsPerMonth() {
        return 56;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
