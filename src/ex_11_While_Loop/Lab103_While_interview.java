package ex_11_While_Loop;

import java.util.Scanner;

public class Lab103_While_interview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int factorial = 1;
        if (number <= 0){
            System.out.println(factorial);
        }else{
//            int i = 1;
//            while (i <= number){
//                factorial = factorial * i;
//                i++;
                for(int i=1;i<=number; i++ ){
                    factorial = factorial*i;
            }
            System.out.println("Factorial of a number" + number + ":" + factorial);
        }

    }
}
