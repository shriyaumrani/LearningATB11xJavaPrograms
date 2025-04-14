package ex_30_Exceptions;

public class Lab_196_exceptions {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        String input_user = args[0];
        int a = Integer.parseInt(input_user);
        int output = 100/a;
        System.out.println(output);
        System.out.println("End of a program");

        // divide by zero -> ?

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds

    }
}
