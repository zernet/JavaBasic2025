package com.gmail.zernetcsgo.hw11;

public class PersonApp {
    public static void main(String[] args) {

        Person john  = new Person("John", 30, "Інженер");
        Person mary  = new Person("Mary", 25, "Вчитель");
        Person alice = new Person("Alice", 28, "Архітектор");

        System.out.println(john);
        System.out.println(mary);
        System.out.println(alice);

        alice.setProfession("Дизайнер");

        System.out.println("\nПісля оновлення професії:");
        System.out.println(alice);
    }
}
