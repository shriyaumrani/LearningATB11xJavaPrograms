package ex_20_polymorphism.overloading;

public class Lab164_poly_overloading {
    public static void main(String[] args) {
        mathoperation m1 = new mathoperation();
        int r1 = m1.add(4,5);
        System.out.println(r1);
        int r2 = m1.add(4,5,6);
        System.out.println(r2);
        double r3 = m1.add(89,90);
        System.out.println(r3);
        String r4 = m1.add("Shriya", "Malhar");
        System.out.println(r4);

    }

}

class mathoperation{

    // In the same class, When you have a method wit same
    // name but different arguments and different return type.

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b,int c){
        return a + b + c;
    }
    double add(double a, double b){
        return a + b;
    }
    String add (String a, String b){
        return a +b;
    }

}
