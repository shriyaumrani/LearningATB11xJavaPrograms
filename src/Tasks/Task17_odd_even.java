package Tasks;

public class Task17_odd_even {
    public static void main(String[] args) {
        int[] numbers = {30, 78, 55, 43, 91, 79, 73, 82, 65, 54};
        for (int i=0;i<numbers.length;i++)
        {
            if (i%2==0){
                System.out.println("The number "+i+" is even");
            }else {
                System.out.println("The number "+i+" is odd");
            }
        }
    }
}
