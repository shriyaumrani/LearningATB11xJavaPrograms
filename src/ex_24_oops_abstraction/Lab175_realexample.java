package ex_24_oops_abstraction;

public class Lab175_realexample {
    public static void main(String[] args) {
        c1 c2 = new c1("Shriya", "Pune", 37);
        c2.compute_pay();
        c2.mailcheck();
    }


}

abstract class Employee{
    private String name;
    private String address;
    private int age;


     Employee(){
         System.out.println("DC");
     }
     Employee(String name, String address, int age){
         this.name = name;
         this.address = address;
         this.age = age;
     }
     abstract double compute_pay();

     void mailcheck(){
         System.out.println("Mailing a check to" + this.name + " " + this.address);
     }


}

class c1 extends Employee{

    c1(String name, String address, int age){
        super(name,address,age);
    }
    @Override
    double compute_pay() {
        return 0;
    }
}