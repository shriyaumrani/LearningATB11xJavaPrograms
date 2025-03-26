package ex_14_Strings;

public class Lab121_interview {
    public static void main(String[] args) {
        String S1 =  "Hello"; // SCP
        String S2 = "Hello"; // SCP
        String S3 = "Hello"; // SCP

        // only 1 "Shriya" available in SCP. Strings are immutable and once created exist in a pool
        // All references will be pointed towards "Shriya"

        String A = new String("Hello");
        String B = new String("Hello");
        String C = new String("hello");
        // 3 strings will be available as new operator creates new strings every time stored in object area
    }

}
