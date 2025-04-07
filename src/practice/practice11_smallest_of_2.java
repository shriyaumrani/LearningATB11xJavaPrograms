package practice;

import java.util.Scanner;

public class practice11_smallest_of_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int a1 = scanner.nextInt();
        System.out.println("Enter second number");
        int a2 = scanner.nextInt();

        System.out.println("a1: " + a1 + "\na2: " + a2);

        numbercomparator numbercomparator = new numbercomparator(a1,a2);
        int min_number = numbercomparator.find_min();
        System.out.println("The min number is: " + min_number);

    }




}







class numbercomparator{
    private int a1,a2;

    public numbercomparator(int a1, int a2){
        this.a1 = a1;
        this.a2 = a2;
    }

    public int find_min(){
        int min = a1;
        if (a2 < min){
            min = a2;
        }

        return min;





    }
}