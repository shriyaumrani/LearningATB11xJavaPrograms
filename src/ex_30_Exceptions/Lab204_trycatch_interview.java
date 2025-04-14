package ex_30_Exceptions;

public class Lab204_trycatch_interview {
    public static void main(String[] args) {
        try {
            String s1 = null;
            s1.trim();
            int a = 100/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }
}
