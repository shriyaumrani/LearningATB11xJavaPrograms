package ex_29_wrapperclass;

public class Lab194_wrapper_conversions {
    public static void main(String[] args) {
        String num = "10";
        int aaa = 10;

        // String to wrapper - parseX Integer.parseInt(num);Double.parseDouble()

        Integer a = Integer.parseInt(num);
        Double b = Double.parseDouble("10");

        Integer c = Integer.valueOf(num);

       // String to primitive

        int aa = Integer.parseInt(num);

        // wrapper to string

        System.out.println(a.toString());

        // primitive to  string

        int age = 11;
        Integer wrapper = age;
        System.out.println(wrapper.toString());


    }
}
