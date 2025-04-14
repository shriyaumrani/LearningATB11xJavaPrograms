package ex_30_Exceptions;

public class Lab201_try_catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 100/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("2");
    }
}
