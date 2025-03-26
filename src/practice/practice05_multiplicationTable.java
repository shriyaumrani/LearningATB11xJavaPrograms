package practice;

import java.util.Scanner;

public class practice05_multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int n = 10;
        for(int i = 1; i <= n; ++i) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

}
