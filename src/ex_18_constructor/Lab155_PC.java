package ex_18_constructor;

public class Lab155_PC {
    public static void main(String[] args) {
        vehicle c1 = new vehicle();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println(".......");

        vehicle c2 = new vehicle("tesla", "TATA", 1991);
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);


    }

}


class vehicle{
    String name;
    String model;
    int year;

    // DC
    vehicle(){
        name = "Unknown";
        model = "xxx";
        year = 1991;
        System.out.println("DC");
    }

    //PC

    vehicle(String name, String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
    }
}