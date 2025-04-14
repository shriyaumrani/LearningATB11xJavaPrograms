package Tasks;

import java.util.Scanner;

public class Task28_multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }


}
