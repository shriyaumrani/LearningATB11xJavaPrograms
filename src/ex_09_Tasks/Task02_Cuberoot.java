package ex_09_Tasks;

public class Task02_Cuberoot {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 10;

        double x1 = Math.pow(x,2);
        double y1 = Math.pow(y,2);
        double z1 = Math.abs(z);
        double result = Math.cbrt(x1 + y1 - z1);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);
        System.out.println(result);

    }
}
