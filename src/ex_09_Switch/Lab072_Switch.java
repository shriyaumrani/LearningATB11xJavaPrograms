package ex_09_Switch;

import java.util.Scanner;

public class Lab072_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day no (1-7)");
        int day = scanner.nextInt();
        switch(day) {
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            // if default is not added, and input is not in the conditions then nothing is printed

        }
        scanner.close();
    }
}
