package ex_29_wrapperclass;

public class Lab191_primitive_wrapper {
    public static void main(String[] args) {
        int a = 10; // primitive data type
        // no attributes or behavoir
        // this is not an object

        // // char, short, byte, long, float, double, - we will avoid them now


        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float

        Integer age = 65;
        System.out.println(Integer.max(65,89));
        System.out.println(Integer.min(65,89));
        System.out.println(age);
        System.out.println(age.intValue());

    }
}
