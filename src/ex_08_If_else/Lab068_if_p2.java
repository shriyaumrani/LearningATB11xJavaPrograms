package ex_08_If_else;

import java.util.Scanner;

public class Lab068_if_p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        if(age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cant vote");
        }
    }
}
