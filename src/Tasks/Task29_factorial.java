package Tasks;

import java.util.Scanner;

public class Task29_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial *= i;}

        System.out.println("factorial of a number: " + factorial);

    }
}


