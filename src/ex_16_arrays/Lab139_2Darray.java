package ex_16_arrays;

public class Lab139_2Darray {
    public static void main(String[] args) {
        //1,2,3
        //4,5,6
//        7,8,9
        int[][] array_old = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        //new method
        int[][] array_new = new int[3][3];
        array_new[0][0] = 1;
        array_new[0][1] = 2;
        array_new[0][2] = 3;
        // row 1 and column 1,2,3

        array_new[1][0] = 4;
        array_new[1][1] = 5;
        array_new[1][2] = 6;
        // row 2 and column 1,2,3

        array_new[2][0] = 7;
        array_new[2][1] = 8;
        array_new[2][2] = 9;

        int[][] array1;
        array1 = new int[][] { {10, 20}, {30, 40}, {50, 60} };
        // 10,20
        // 30,40
        // 50,60
        // row 3 and column 1,2,3

    }
}
