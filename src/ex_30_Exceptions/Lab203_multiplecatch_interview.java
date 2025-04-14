package ex_30_Exceptions;

public class Lab203_multiplecatch_interview {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 90/0;
        } catch (Exception e) {
            System.out.println("Are you fool");; // multiple exceptions
        }// catch (ArithmeticException e) {
           // System.out.println(e.getMessage());;
        }
        // We can not have smaller exception after bigger exception
    }

