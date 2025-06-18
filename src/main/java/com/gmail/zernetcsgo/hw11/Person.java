package com.gmail.zernetcsgo.hw11;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }
}