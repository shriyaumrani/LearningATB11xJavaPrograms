package ex_16_arrays;

import java.util.Arrays;

public class Lab132_arrays_print {
    public static void main(String[] args) {
        int[] marks = {10,20,30,40,50,60,70};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        Arrays.sort(marks); // it is a class

        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }



    }
}
