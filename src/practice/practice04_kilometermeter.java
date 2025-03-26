package practice;

import java.util.Scanner;

public class practice04_kilometermeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double conversionRatio = 0.621;
        System.out.println("Enter the distance in km");
        double distance = input.nextDouble();
        System.out.println("The distance in km is: " + distance + " " + "km");
        double miles = distance * conversionRatio;
        System.out.println("The distance in miles is: " + miles + " " + "miles");

    }
}
