package ex_18_constructor;

public class Lab157_classoverloading {
    public static void main(String[] args) {
        person1 p1 = new person1();
        person1 p2 = new person1("Shriya", "Pune");
        person1 p3 = new person1("Malhar", "Pune", 5000000);

        p1.name = "Shriya";
        System.out.println(p1.name);
        System.out.println("......");
        System.out.println(p2.name);
        System.out.println(p3.name);
        p1.eat();;
        p2.eat();
        p3.eat();
    }

}

class person1{
    String name;
    String place;
    double salary;

    person1(){

    }
    person1(String name, String place, double salary){
        this.name = name;
        this.place= place;
        this.salary= salary;
    }
    person1(String name,String place){
        this.name = name;
        this.place = place;
    }
    void eat(){
        System.out.println(this.name + " is eating");
    }
}
