package Tasks;

public class Task16_secondmax {
    public static void main(String[] args) {
        int[] number={45,23,86,3,56,25,76};
        int max=number[0];
        int se_max=number[1];
        for (int i=0;i<number.length;i++){
            if(number[i]>max)
            {
                se_max=max;
                max=number[i];
            } else if (number[i]>se_max && number[i]!=max) {
                se_max=number[i];

            }

        }
        System.out.println("First largest number is: "+max);
        System.out.println("Second largest number is: "+se_max);

    }
}




