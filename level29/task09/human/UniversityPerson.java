package com.javarush.task.task29.task2909.human;

import java.util.List;

public class UniversityPerson extends Human{

    private University university;

    @Override
    public List<Human> getChildren() {
        return super.getChildren();
    }
    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public void setBloodGroup(BloodGroup bloodGroup) {
        super.setBloodGroup(bloodGroup);
    }

    @Override
    public BloodGroup getBloodGroup() {
        return super.getBloodGroup();
    }

    public UniversityPerson(String name, int age) {
        super(name, age);
    }

    @Override
    public void addChild(Human human) {
        super.addChild(human);
    }

    @Override
    public void removeChild(Human human) {
        super.removeChild(human);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void live() {
        super.live();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void printSize() {
        super.printSize();
    }
}
