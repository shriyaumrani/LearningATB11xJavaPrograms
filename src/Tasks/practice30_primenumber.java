package Tasks;

import java.util.Scanner;

public class practice30_primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        boolean isprime = true;

        if (n<=1){
            isprime = false;
        }else{
            for(int i = 2; i<Math.sqrt(n); i++){
                if (n % i == 0){
                    isprime = false;
                    break;
                }
            }
        }

        if (isprime){
            System.out.println(n + "is a prime number");
        }else{
            System.out.println(n + "is not a prime number");
        }


    }
}
