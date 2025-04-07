package practice;

import java.util.Scanner;

public class practice09_maxthree_forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Enter three numbers");
        for(int i=0; i<3; i++){
            System.out.println("number" + (i+1) + ":");
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        for(int i = 0; i < 3; i++){
            if (numbers[i]> i){
                max = numbers[i];
            }
        }
        System.out.println("The maximum numbers is: " + max);

    }
}
