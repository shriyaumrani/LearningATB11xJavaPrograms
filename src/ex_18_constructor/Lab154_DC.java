package ex_18_constructor;

public class Lab154_DC {
    public static void main(String[] args) {
        car c1 = new car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println(".......");

        car c2 = new car();
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);


    }
}


class car{
    String name;
    String model;
    int year;
    // DC
    car(){
        name = "unknown car";
        model = "xxx";
        year = 1991;
    }
}