package ex_14_Strings;

public class Lab118_String_creation {
    public static void main(String[] args) {

        //String creation by 2 ways

        String name = "Shriya"; // stored in string constant pool
        String name1 = new String("Shriya"); // stored in object area of heap area
        System.out.println(name1);
    }
}
