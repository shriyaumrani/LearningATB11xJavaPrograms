package ex_05_Typecasting;

public class Lab046_Typecastig {
    public static void main(String[] args) {
        long a = 986756666l;
        short s = (short)a;
        System.out.println(s);
       // short s = a; // implicit narrowing not allowed
    }
}
