package Tasks;

import java.util.Scanner;

public class Task11_counting_consonents_vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.next();

        int con = 0;
        int vow = 0;
        for(int i = 0; i< string.length(); i++){
            char ch = string.toLowerCase().charAt(i);

            if (ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u'){
                ++vow;
            }else{
                ++con;
            }
        }
        System.out.println("Vowels: " + vow);
        System.out.println("Consonents: " + con);
    }
}
