package practice;

import java.util.Scanner;

public class practice12_smallest_of_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = scanner.nextInt();
        System.out.println("Enter a second number");
        int b = scanner.nextInt();
        System.out.println("Enter a third number");
        int c = scanner.nextInt();

        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);

        numbercompare numbercompare = new numbercompare(a,b,c);
        int min = numbercompare.find_min_three(a,b,c);
        System.out.println("min_of_three: " + min);
    }
}



class numbercompare{
    private int a,b,c;

    public  numbercompare(int a, int b, int c){
        this.a = a;
        this.b = b;
    }
    public int find_min_three(int a, int b, int c){
        int min = a;
        if (b < min){
            min = b;
        }if (c < min){
            min = c;
        }
        return min;
    }
}