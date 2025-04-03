package ex_17_Oops;

public class Laab146_oops {
    public static void main(String[] args) {
        Person amit;
        Person p2 = new Person();

        // Person - class
        // P2 - reference
        // new person() - Object

        p2.name = "Shriya";
        System.out.println(p2.name);
        Person p3 = new Person();
        p3.name = "Malhar";
        System.out.println(p3.name);
        new Person().name = "Not ref name";
        System.out.println(new Person().name); // prints null value

        //Setting attributes
        p3.name = "Malhar";
        p3.phone = "9876543210";
        p3.colour_eyes = "Brown";
        p3.legs = 2;
        p3.salary = 50000;
        p3.age = 30;
        p3.weight = 70.5;
        p3.is_male = true;

        //Callin methods

        System.out.println(p2.sleep("Shriya"));;
        p2.eat();
        System.out.println(p2.greet("Shriya"));
        System.out.println("Remaining sal: " + p2.remaining_salary(50000,5000));



    }


        }
class Person{
    // Attributes|Properties|Data members|Instance variables
    String name;
    String phone;
    String colour_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean is_male;

    // behaviour|function|method

    String sleep(String name){
        return name + "is sleeping";
    }
    void eat(){
        System.out.println("eating");
    }
    String greet(String name){
        return "Hello" + name;
    }
    int remaining_salary(int salary, int tax){
        return salary-tax;
    }
}

