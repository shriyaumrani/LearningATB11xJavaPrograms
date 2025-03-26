package ex_10_For_Loop;

public class Lab93_Odd_Even {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            if (i%2==0){
                System.out.println(i + "->"+"The number is Even");
            }else{
                System.out.println(i + "->"+"The number is odd");
            }
        }
    }
}
