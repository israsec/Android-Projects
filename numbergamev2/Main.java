package com.aaron.numbergamev2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to wonderland!");
        System.out.println("Whats your name player?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Are you ready to begin? Enter 1 or 2");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int start = scanner.nextInt();

        while (start != 1) {
            System.out.println("Are you ready to begin? Enter 1 or 2");
            System.out.println("1. Yes");
            System.out.println("2. No");
            start = scanner.nextInt();
        }
        System.out.println("Start guessing!");
        Random random = new Random ();
        int number = random.nextInt(21);

        int guess = scanner.nextInt();

        int attempts = 0;
        boolean won = false;
        boolean finish = false;

        while (!finish) {
            attempts++;
            if (attempts < 5) {
                if (guess == number) {
                    won = true;
                    finish = true;
                } else if (guess > number) {
                    System.out.println("Guess lower...");
                    guess = scanner.nextInt();
                } else {
                    System.out.println("Guess higher... ");
                    guess = scanner.nextInt();
                }
            } else {
                finish = true;
            }
        }

        if (won) {
            System.out.println("Congratulations! You got it in " + attempts + " attempts!");
        } else {
            System.out.println("**GAME OVER**");
            System.out.println("The number was " + number);
        }
    }
}
