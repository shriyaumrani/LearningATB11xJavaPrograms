package ex_29_wrapperclass;

public class Lab193_wrapper_conversion {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // boxing. JVM automatically stores the value
        // primitive to wrapper - automatic
        System.out.println(b.intValue()); // behavior

        Integer a2 = 65;
        int c = a2; // unboxing, wrapper  removed, attribute and behavior lost
    }



}
