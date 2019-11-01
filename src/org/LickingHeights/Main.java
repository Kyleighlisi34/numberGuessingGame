package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        String response;
        Scanner keyboard = new Scanner(System.in);
        int pickedNumber;

        System.out.println("Welcome to the Number Guessing Game, try to guess the number that I am thinking!");
        System.out.println("I am thinking of a number between 1 and 100, guess it right and you win!");
        System.out.println("Ready...Set...Take your first guess!");

        //logic


        do {
            int randomNumber = (int) (Math.random() * 100) + 1;

            do {
                pickedNumber = keyboard.nextInt();
                System.out.println(logic(pickedNumber, randomNumber));
            } while (pickedNumber != randomNumber);

            //game loop
            System.out.println("Do you want to play again?");
            response = keyboard.next();

        } while (!response.equalsIgnoreCase("yes"));
    }

    public static String logic(int pickedNumber, int randomNumber){
        //return variable
        String numberGuess;

        if (pickedNumber < randomNumber) {
            numberGuess = ("Too low, try again :) ");
        }
        else if (pickedNumber > randomNumber){
            numberGuess = ("Too high, try again :)");
        }
        else {
            numberGuess =("Congratulations! You won!");
        }
        return numberGuess;



    }

}























