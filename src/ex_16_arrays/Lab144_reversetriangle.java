package ex_16_arrays;

import java.util.Scanner;

public class Lab144_reversetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();
        for(int i = size; i>=0; i--){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
    }
}

}

