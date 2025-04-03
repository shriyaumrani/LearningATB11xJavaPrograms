package ex_16_arrays;

public class Lab133_max_min {
    public static void main(String[] args) {
        int [] array = {25,50,80,100,200,60};

        int max_output = give_me_max_output(array);
        int min_output = give_me_min_output(array);
        System.out.println(max_output);
        System.out.println(min_output);

    }
    static int give_me_max_output(int[]array){
        int max = array[0];
        for(int i = 0; i < array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    static int give_me_min_output(int[]array){
        int min = array[0];
        for(int i = 0; i< array.length;i++){
            if(array[i]<min){
                min = array[i];
            }

        }
        return min;
    }

}
