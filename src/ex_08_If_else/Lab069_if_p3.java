package ex_08_If_else;

public class Lab069_if_p3 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age >= 18){
            System.out.println("You can vote");
        }else{
            System.out.println("You cant vote");
        }
    }
}
