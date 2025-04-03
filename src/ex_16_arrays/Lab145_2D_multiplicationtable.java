package ex_16_arrays;

import java.util.Scanner;

public class Lab145_2D_multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        for(int i = 0;i<size;i++){
            for(int j =0;j<size;j++){
                System.out.print((i*j) + "\t" + "|" );
            }
            System.out.println();

        }
    }
}
