package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name, yourday, whyyourday;

        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        name = input.nextLine();
        System.out.println("Nice to meet you, " + name + ", how was your day been?");
        yourday = input.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that " + yourday + "?");
        whyyourday = input.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
        System.out.println("\n");
        System.out.println("Here are your responses: " + name + " " + yourday + " " + whyyourday);
    }
}
