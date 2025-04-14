package ex_30_Exceptions;

public class Lab202_multiplecatch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 90/0;
        } catch (ArithmeticException e) {
            System.out.println("Are you fool");; // multiple exceptions
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("2");
    }
}
