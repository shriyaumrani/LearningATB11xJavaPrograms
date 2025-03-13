package ex_04_Operators;

public class Lab032_Interview_concat1 {
    public static void main(String[] args) {
        String a = "Shriya";
        String b = "Umrani";
        int c = 10;
        int d = 20;
        System.out.println(a+b+c+d); // reads first data type if string then concatenates
        System.out.println(a+b+(c+d)); // reads first data type if string then concatenates. if bracket added for int then sum
        System.out.println(c+d+a+b);// if initial data types are int the addition and the concatenation of string

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
