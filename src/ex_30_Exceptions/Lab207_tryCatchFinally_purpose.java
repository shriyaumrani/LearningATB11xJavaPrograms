package ex_30_Exceptions;

import java.util.Scanner;

public class Lab207_tryCatchFinally_purpose {
    public static void main(String[] args) {
        Scanner scanner = null;
        scanner = new Scanner(System.in);
        int  v = scanner.nextInt();

        try {
            int b = 10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        } finally {
            scanner.close();// iirespective of try and catch close the scanner
            System.out.println("End of program. Sc closed");
        }
    }
}
