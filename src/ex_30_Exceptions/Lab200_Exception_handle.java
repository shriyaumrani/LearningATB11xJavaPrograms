package ex_30_Exceptions;

public class Lab200_Exception_handle {
    public static void main(String[] args) {

        int a = 0;

        try{
            a = 10/0;
       } catch (Exception e) {
           System.out.println(e.getMessage());;
       }
        System.out.println(a);
    }
}
