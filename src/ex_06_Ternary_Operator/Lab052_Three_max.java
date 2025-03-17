package ex_06_Ternary_Operator;

public class Lab052_Three_max {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int result = (a > b && a > c)? a : (b > a && b > c)? b : c;
        System.out.println(result);



    }
}
