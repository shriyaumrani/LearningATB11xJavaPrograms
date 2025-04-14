package ex_30_Exceptions;

public class Lab199_Handle_Exception{
    public static void main(String[] args) {
            System.out.println("Starting the program");
        int output =0;
        try {
            String input_user = args[0];
            int a = Integer.parseInt(input_user);
            output = 100/a;
        } catch (ArrayIndexOutOfBoundsException|ArithmeticException|NumberFormatException e) {
            System.out.println(e.getMessage());;
        } // we dont create object of e directly using the method. JVM creates it. Built in function
        System.out.println(output);
            System.out.println("End of a program");



    }
}
