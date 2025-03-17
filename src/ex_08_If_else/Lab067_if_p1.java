package ex_08_If_else;

public class Lab067_if_p1 {
    public static void main(String[] args) {
        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);
        int age = Integer.parseInt(age1);
        if(age >= 18){
            System.out.println("You can vote");
        }else {
            System.out.println("You cant vote");
        }
    }
}
