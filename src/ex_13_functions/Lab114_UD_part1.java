package ex_13_functions;

public class Lab114_UD_part1 {
    public static void main(String[] args) {
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        // 1.Without Parameters and Without Return Type
        greet();
        // 2.Without Parameters but With Return Type
        String msg = greet_with_Hello_wp_wt_RT();
        System.out.println(msg);
        //3.With Parameters and Without Return Type
        greet_with_details("Shriya","Umrani");
        // 4. With Parameters and With Return Type
        int result = sum(3,4);
        System.out.println(result);



    }
    //1. Without Parameters and Without Return Type. (Declare) /Define
    static void greet(){
        System.out.println("Good Morning");
    }
    //2. Without Parameters but With Return Type
    static String greet_with_Hello_wp_wt_RT(){
        return "Hi";
    }
    //3.With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String firstname,String lastname){
        System.out.println("Your name is: " + firstname +"\nYour last name is: "+ lastname);
    }
    //4. With parameters and return type
    static int sum(int a, int b){
        return a+b;
    }

}
