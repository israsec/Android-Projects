package com.aaron.numbergame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**Welcome to the greatest game in the Galaxy!!**");
        System.out.println("What should we call you great player?");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.next();
        System.out.println("Welcome to our newest astronaut " + name + "!");
        System.out.println("Are you ready to start the game?");
        String yesNo = scanner1.next();
        System.out.println("Alright lets go!");
        System.out.println("We thought of a random number between 1 and 30. You have five guesses - use them wisely!");
        System.out.println("Guess number one:");
        Random random1 = new Random();
        int number = random1.nextInt(20);
        int guess1 = scanner1.nextInt();

        if (guess1==number)
            {
            System.out.println("You got it on one guess! You rock!!");
            } else {
            System.out.println("Sorry, wrong number guess again..."); }

        System.out.println("Guess number two:");

        int guess2 = scanner1.nextInt();
        if (guess2==number) {
            System.out.println("Correct! You got it on the second guess!");
       // } else if (guess2!=number) {
      //      System.out.println("Sorry, wrong number guess again...");
        } else if (guess2<number) {
            System.out.println("Sorry, wrong number guess again...");
            System.out.println("It looks like you need some help...try to guess a little higher!");
            System.out.println("Guess three:");
        } else {
            System.out.println("Sorry, wrong number guess again...");
            System.out.println("It looks like you need some help...try to guess a little lower!");
            System.out.println("Guess three:");
            }

        int guess3 = scanner1.nextInt();
        if (guess3==number) {
            System.out.println("Amazing you got it in three guesses!");
        } else if (guess3>number){
            System.out.println("Sorry, wrong number guess again...");
            System.out.println("It looks like you need some help...try to guess a little lower!");
            System.out.println("Guess four:");
        }
        else {
            System.out.println("Sorry, wrong number guess again...");
            System.out.println("It looks like you need some help...try to guess a little higher!");
            System.out.println("Guess four:");
        }

        int guess4 = scanner1.nextInt();
        if (guess4==number) {
            System.out.println("Amazing you got it in four guesses!");
        } else if (guess4>number){
            System.out.println("Sorry, wrong number guess again...");
            System.out.println("It looks like you need some help...try to guess a little lower!");
            System.out.println("Last chance!! Guess five:");

        }
        else {
            System.out.println("Sorry, wrong number guess again...");
            System.out.println("It looks like you need some help...try to guess a little higher!");
            System.out.println("Last chance!! Guess five:");
        }
        int guess5 = scanner1.nextInt();
        if (guess5==number) {
            System.out.println("Amazing you got it in five guesses!");
        }else {
            System.out.println("Sorry, wrong number...");
            System.out.println("**GAME OVER!**");
            System.out.println("The correct number was " + number);
        }

    }

}