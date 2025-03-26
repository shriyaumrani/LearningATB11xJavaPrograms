package ex_10_For_Loop;

public class LAB90_FORlOOP90 {
    public static void main(String[] args) {
        for (int i = -1; i < -10 ; i--) { // condition not satisfied.
            // condition is i < -10 but i =-1 which is greater than -10 hence it doesnt enter the loop
            System.out.println(i);
        }
//        for (int i = -11; i < -10 ; i--) { // infinite loop
//            // condition is i < -10 and i =-11 condition is true when it is decremented the value is always true
//            System.out.println(i);

    }
}
