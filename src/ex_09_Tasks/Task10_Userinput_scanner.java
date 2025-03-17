package ex_09_Tasks;

import java.util.Scanner;

public class Task10_Userinput_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Name: "+name);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Age: " + age);
        System.out.println("Enter your salary");
        float salary = scanner.nextFloat();
        System.out.println("salary: "+salary);
    }
}
