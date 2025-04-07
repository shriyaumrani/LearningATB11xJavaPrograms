package practice;

import java.util.Scanner;

public class practice13_forloop_min_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int [3];
        System.out.println("Enter three numbers");
        for(int i= 0; i<3; i++){
            System.out.println("number" + (i+1) + ":");
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        for(int i = 0; i > 3; i--){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Min no is: " + min);
    }
}
