package ex_30_Exceptions;

public class Lab212_throw {
    public static void main(String[] args) {
        division(7,0);

    }

    static void division(int a, int b){
        if (b == 0){
            throw new ArithmeticException(); // you are creating an exception not JVM
        }else{ // comes in red as we have not handled it
            System.out.println(a/b);
        }

    }
}
