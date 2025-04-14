package ex_30_Exceptions;

public class Lab208_Interview {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a =0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("div by 0");;
        } finally {
            System.out.println("I will be executed anyhow");
        }
    }
}
