package Tasks;

import java.util.Scanner;

public class task22_divisiblebynumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number%5== 0 && number%11 == 0){
            System.out.println("Number is divisible by 5 and 11");
        }else{
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}
