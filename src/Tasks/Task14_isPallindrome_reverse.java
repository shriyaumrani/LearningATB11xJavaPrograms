package Tasks;

import java.util.Scanner;

public class Task14_isPallindrome_reverse {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a word, I will check if it is a pallindrome");
        String userInput = Sc.next();
        String newstring = reversestring(userInput);
        if(newstring.equalsIgnoreCase(userInput)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not a pallindrome");
        }


    }
    private static String reversestring(String userInput){
        StringBuilder stringBuilder = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();

    }
}
