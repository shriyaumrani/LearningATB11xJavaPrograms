package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab104_guessingNumber {
    public static void main(String[] args) {
        // guess a number between 1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int guess;
        int attempts = 10;

        while (true){
            guess = scanner.nextInt();
            attempts ++;

            if(guess < numberToGuess){
                System.out.println("Too low, Try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, Try again");

            } else{
                System.out.println("Correct, You guessed in" + attempts + "attempts");
                break;
            }
        }
    }
}
