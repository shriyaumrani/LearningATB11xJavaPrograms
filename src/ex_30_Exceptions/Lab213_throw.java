package ex_30_Exceptions;

import java.util.Scanner;

public class Lab213_throw {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    private static void validateAge(int age) throws Exception {
        if (age < 18){
            throw new Exception("You cant go to Goa");
        }else{
            System.out.println("You can go");
        }
    }
}
