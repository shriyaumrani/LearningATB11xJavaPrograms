package ex_16_arrays;

public class Lab142_Arrayprint {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{3,4,5},{6,7,8}};
        for(int i =0; i< array.length;i++){         // rows
            for(int j = 0; j<array[i].length;j++){  // columns
                System.out.print(array[i][j] + " ");
//                System.out.print("*"+ " "); // prints starts
            }
            System.out.println();
        }

    }
}
