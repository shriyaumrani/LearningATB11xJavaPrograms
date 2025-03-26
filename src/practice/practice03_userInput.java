package practice;

import java.util.Scanner;

public class practice03_userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Age is" + age);
        input.close();

    }
}

