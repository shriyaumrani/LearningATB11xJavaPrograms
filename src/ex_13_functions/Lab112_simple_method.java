package ex_13_functions;

public class Lab112_simple_method {
    public static void main(String[] args) {
        f1(); // void : no return
        int result = return_int(); //returns the value
        System.out.println(result);
        boolean r = return_boolean();
        System.out.println(r);


    }
    static void f1(){
        System.out.println("No return");
    }
    static int return_int(){
        return 10;
    }
    static boolean return_boolean(){
        return true;
    }
    static float return_float_pi(){
        return 3.14f;
    }
    static byte return_byte(){
        return 100;
    }
    static long return_long(){
        return 1000l;
    }
    static String return_string(){
        return "shriya";
    }
}
