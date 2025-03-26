package Tasks;

import java.util.Scanner;

public class Task13_isPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input, I will check the pallindrome");
        String userInput = sc.next();
        String newString = reverseString(userInput);
        if(newString.equalsIgnoreCase(userInput)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not a Pallindrome");
        }


    }
    private static String reverseString(String userInput){
        String reversed = "";
        for(int i = userInput.length() -1; i>=0;i--){
            reversed= reversed + userInput.charAt(i);
        }
        return reversed;
    }

}
