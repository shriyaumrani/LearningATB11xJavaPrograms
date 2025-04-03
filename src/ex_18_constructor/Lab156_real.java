package ex_18_constructor;

public class Lab156_real {
    public static void main(String[] args) {
        person p1 = new person("Shriya","Pune",988123567);
        person p2 = new person("Parth", "Pune", 980678456);
        person p3 = new person();
        p3.name = "Malhar";
        System.out.println(p3.name);
        System.out.println(".....");
        person p4 = new person("Malhar","Pune");
        System.out.println(p4.place);
        System.out.println("....");
        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}


class person{
    String name;
    long phone;
    String place;

    person(){

    }
    person(String name,String place,long phone){
        this.name = name;
        this.place = place;
        this.phone = phone;
    }
    person(String name, String place){
        this.name = name;
        this.place = place;
    }
    void eat(){
        System.out.println(this.name + " is eating");
    }
}