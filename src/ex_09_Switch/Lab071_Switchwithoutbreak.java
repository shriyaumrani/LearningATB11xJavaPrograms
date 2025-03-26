package ex_09_Switch;

import java.util.Scanner;

public class Lab071_Switchwithoutbreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day no(1-7)");
        int day = input.nextInt();
// if break statement is not used the all the conditions are executed after the input
        switch (day) {
            case 1:
                System.out.println("It is Monday");
            case 2:
                System.out.println("It is Tuesday");
            case 3:
                System.out.println("It is Wednesday");
            case 4:
                System.out.println("It is Thursday");
            case 5:
                System.out.println("It is Friday");
            case 6:
                System.out.println("It is Saturday");
            case 7:
                System.out.println("Is is Sunday");
            default:
                System.out.println("invalid day no");


        }
        input.close();
    }
}