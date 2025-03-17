package ex_05_Typecasting;

public class Lab045_Typecasting_narrowing {
    public static void main(String[] args) {
        int val = 300;
       // byte b = val; // invalid - narrowing - implicit casting not allowed
        byte b = (byte)val; // valid- narrowing - explicit casting allowed- data loss
        System.out.println(b);
    }
}
