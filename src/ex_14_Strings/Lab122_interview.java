package ex_14_Strings;

public class Lab122_interview {
    public static void main(String[] args) {
        String S1 =  "Hello"; // SCP
        String S4 = "Hello"; // SCP


        // only 1 "Shriya" available in SCP. Strings are immutable and once created exist in a pool
        // All references will be pointed towards "Shriya"

        String S2 = new String("Hello");
        String S3 = new String("Hello");
        String S5 = new String("hello");
        // 3 diff strings available

        // == comparison - String - check the location ref
        System.out.println(S1==S3);//flase diff location
        System.out.println(S1==S2);//false diff location
        System.out.println(S2==S3);//false diff location
        System.out.println(S1==S4);//true same location

        // If content needs to be checked then use the function equal

        System.out.println(S2.equals(S3));
        System.out.println(S2.equals(S5));
        System.out.println(S2.equalsIgnoreCase(S5)); //ignores the cases

    }
}
