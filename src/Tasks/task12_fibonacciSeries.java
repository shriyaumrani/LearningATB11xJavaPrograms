package Tasks;

import java.util.Scanner;

public class task12_fibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("Fibonacci Series till " + number + " terms");
        int firstTerm = 0, secondTerm = 1;
        for(int i = 0; i<number;i++){
            System.out.print(firstTerm);
            if(i<number-1){
                System.out.print(", ");
            }
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;


        }

    }
}

