package ex_09_Tasks;

public class Task07_Inc_Dec_Operator {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // A + B + C
        //A = --a expression 19 a= 19
        //B = a++ expression 19 a= 20
        //C = a-- expression 20 a = 19
        //A + B+C = 58 ; a = 19

    }
}
