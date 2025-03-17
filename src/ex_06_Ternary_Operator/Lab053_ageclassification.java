
package ex_06_Ternary_Operator;

public class Lab053_ageclassification {
    public static void main(String[] args) {
        String age1 = args[1];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);

    }

}
