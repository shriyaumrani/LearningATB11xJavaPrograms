package ex_30_Exceptions;

public class Lab205_interview {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            int d = 100/b; // try catch only to vulnerable code
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
