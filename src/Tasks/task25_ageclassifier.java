package Tasks;

import java.util.Scanner;

public class task25_ageclassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();

        if(age >= 0 && age <=12){
            System.out.println("You are child");
        } else if (age >= 13 && age <=19) {
            System.out.println("You are a teenager");
            
        } else if (age >= 20 && age <=64) {
            System.out.println("You are an adult");
            
        } else if (age >= 65) {
            System.out.println("Yor are senior citizen");
            
        }else{
            System.out.println("Invalid age! Please enter valid age");
        }
    }
}
