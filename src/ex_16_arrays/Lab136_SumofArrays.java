package ex_16_arrays;

public class Lab136_SumofArrays {
    public static void main(String[] args) {

        int[]arrays = {1,2,3,4,5,6,7};
        int sum_of_array = get_sum_of_array(arrays);
        System.out.println(sum_of_array);



    }
    static int get_sum_of_array(int[]arrays){
        int sum = 0;
        for(int i= 0;i< arrays.length;i++){
            sum = sum + arrays[i];
        }
        return sum;
    }

}
