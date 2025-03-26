package ex_10_For_Loop;

public class Lab095_For_continue {
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
                if(i%2==0){
                    continue; // skips the even numbers
                }
            System.out.println(i); // prints only odd numbers
            }
        }
    }

