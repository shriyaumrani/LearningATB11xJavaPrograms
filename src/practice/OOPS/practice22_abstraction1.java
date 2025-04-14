package practice.OOPS;

public class practice22_abstraction1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8.9,10.89);
        System.out.println(r1.calculate_area());
    }
}


abstract class polygon{

    abstract double calculate_area();
}

class Rectangle extends polygon{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this. breadth = breadth;


        }
    double calculate_area(){
        return length * breadth;
    }


}