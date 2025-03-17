package ex_09_Tasks;

import java.util.Scanner;

public class Task09_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter L1 of a triangle: ");
        System.out.println("Enter L2 of a triangle: ");
        System.out.println("Enter L3 of a triangle: ");
        int L1 = scanner.nextInt();
        int L2 = scanner.nextInt();
        int L3 = scanner.nextInt();
        System.out.println("L1"+"="+L1+'\n'+"L2"+"="+L2+'\n'+"L3"+"="+L3);
        if(L1 == L2 && L2 == L3 && L1==L3){
            System.out.println("The triangle is equilateral");
        } else if (L1 == L2 || L2 == L3 || L1==L3) {
            System.out.println("The triangle is isosceles");
        }else{
            System.out.println("The triangle is scalene");
        }

    }
}
