package ex_06_Ternary_Operator;

public class Lab049_interview {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int number = 30;
        String result = number > 0 ? (number > 20? "number > 20" : "number < 20") : "negative";
        System.out.println(result);
    }
}
