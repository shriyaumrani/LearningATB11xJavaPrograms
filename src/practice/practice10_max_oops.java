package practice;

import java.util.Scanner;

public class practice10_max_oops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter a third number");
        int c = scanner.nextInt();

        System.out.println("a: "+ a+ "\nb: "+ b + "\nc: "+ c);

        numbercoparator comparator = new numbercoparator(a,b,c);
        int max = comparator.find_max();
        System.out.println("The max no is: " + max);
    }

}


class numbercoparator {
    private int a, b, c;


    public numbercoparator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int find_max() {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > a) {
            max = c;
        }
        return max;

    }

}

