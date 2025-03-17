package ex_06_Ternary_Operator;

public class Lab051_Even_Odd {
    public static void main(String[] args) {
        int x = 15;
        String even_odd = (x%2 == 0)? "even" : "odd";
        System.out.println(even_odd);
    }
}
