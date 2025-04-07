package practice;

import java.util.Scanner;

public class practice08_Three_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number integer");
        int a = scanner.nextInt();
        System.out.println("Enter a second number");
        int b = scanner.nextInt();
        System.out.println("Enter a third number");
        int c = scanner.nextInt();
        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);

        if (a > 0 && b > 0 && c > 0) {
            if(a > b && a > c ){
                System.out.println("Max no is: " + a);
            } else if (b > a && b > c) {
                System.out.println("Max no is: " + b);

            }else{
                System.out.println("Max no is: " + c);
            }
        }






    }
}


