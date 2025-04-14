package ex_30_Exceptions;

public class Lab206_Try_catch_finally
{
    public static void main(String[] args) {
        int a = 1;
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        } finally {
            System.out.println("I will always execute");

            // code after finally will be always executed
        }
    }
}
