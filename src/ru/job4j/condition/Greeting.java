package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        int year = 2021;

        System.out.println(idea);
        idea = idea + "But I am a newbie.";
        idea = idea + " " + year;

        System.out.println(idea);
    }
}
