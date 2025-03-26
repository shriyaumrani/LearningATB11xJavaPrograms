package ex_09_Switch;

import java.util.Scanner;

public class Lab070_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day no(1-7)");
        int day = input.nextInt();

        switch(day){
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("Is is Sunday");
                break;
            default:
                System.out.println("invalid day no");
                break;






        }
        input.close();
    }
}
