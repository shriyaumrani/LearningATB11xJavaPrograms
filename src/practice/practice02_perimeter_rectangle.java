package practice;

import java.util.Scanner;

public class practice02_perimeter_rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        System.out.println("Enter the breadth: ");
        float length = scanner.nextFloat();
        float breadth = scanner.nextFloat();
        System.out.println("length" + "=" + length + '\n' + "breadth" + "=" + breadth);
        float perimeter = 2*(length + breadth);
        System.out.println("Perimeter of a rectangle is: " + perimeter);


    }
}
