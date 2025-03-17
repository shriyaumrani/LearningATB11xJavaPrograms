package ex_09_Tasks;

public class Task04_Increatment_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a + ++a);
        System.out.println(a);

        // A+B+C
        // A = ++a expression 11 a= 11
        //+
        // B = ++a expression 12 a= 12
        //+
        //C = ++a expression 13 a= 13
        // 11 + 12 +13 = 36 ; a = 13

    }
}
