package Tasks;

import java.util.Scanner;

public class Task18_pyramidpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j =i; j<i; j++){
                System.out.print("*");
            }
            
        }
    }
}
