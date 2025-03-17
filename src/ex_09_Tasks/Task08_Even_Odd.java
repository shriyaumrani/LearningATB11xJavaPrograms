package ex_09_Tasks;

import java.util.Scanner;

public class Task08_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println("The number is: "+number);
        if(number%2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }

    }
}
