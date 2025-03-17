package ex_05_Typecasting;

public class Lab044_Typecasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid - > Implicit Casting- Automatically
        int a1 = (int)b; // Explicit Casting - Widening( doesn't require)
        System.out.println(a);
        System.out.println(a1);
    }
}
