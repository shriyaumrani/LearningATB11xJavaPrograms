package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab105_guessingNumberforloop {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("A number is chosen between 1 to 100");
        System.out.println("You have 10 attempts");
        int k = 10;
        int attempts = 0;
        for (int i = 1; i <= k; i++) {
            System.out.println("Enter your guess ");
            int number = scanner.nextInt();
            attempts++;
            if (number < 1 || number > 100) {
                System.out.println("Please enter a number between 1 to 100");
            } else if (number < numberToGuess) {
                System.out.println("Too low, Try again");
            } else if (number > numberToGuess){
                System.out.println("Too high, Try again");
            }
            else {
                System.out.println("Correct, You have guessed it in" + attempts + "attempts");
                break;
            }
            if (i == k) {
                System.out.println("You have exhausted all the attempts. The correct number was" + numberToGuess);
            }
        }
    }
}



