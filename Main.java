/*
Mini Project 1
Group#2 Graham Koenig, Maggie Korte, Alex Hils, Tanner Daria
9/29/21
*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Please enter any positive whole number: ");

    int guessNum;
    int originalNum;

    Scanner s = new Scanner(System.in);
    Random r = new Random();

    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);
    int numbersForGame = playGame(randomNum, userNum);

    System.out.println("A random number to guess has been generarted.");
  }

  public static int playGame(int guessNum, int originalNum) {

    Scanner g = new Scanner(System.in);
    int userGuess = g.nextInt();
    int numTries = 0;

    System.out.println("Please guess a number between 0 and " + originalNum);

    while (userGuess != originalNum){
      numTries++;
      if (userGuess > originalNum){ 
          System.out.println("Guess lower");
          System.out.println("Enter your new guess: "); }
       if ( userGuess < originalNum) {
          System.out.println("Guess higher");
          System.out.println("Enter your new guess: ");}
        
      if ( userGuess == originalNum){
          System.out.println("Great, you win! It took you " + numTries + "tries");}
      }
        return numTries;
    }

  }