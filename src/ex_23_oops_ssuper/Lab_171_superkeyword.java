package ex_23_oops_ssuper;

public class Lab_171_superkeyword {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car(100);
        c1.display();
    }


}


class vehicle{
    public int max_speed = 180;

    vehicle(){
        System.out.println("default constructor");
    }
    vehicle(int a){
        System.out.println("param constructor");
    }

    void msg(){
        System.out.println("no return, no argument");
    }
    void msg(int a){
        System.out.println("pc - argument");
    }
    void display(){
        System.out.println("vehicle parent");
    }

}

class car extends vehicle {
    private int max_speed = 281;

    public int getMax_speed() {
        return max_speed;
    }


    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    car(){
        super(); // DC
    }
    car(int a){
        super(10);  // pc of parent
    }

    @Override
    void display() {
        System.out.println(this.max_speed);

        // for parent
        System.out.println(super.max_speed);
        super.msg();
        super.msg();
        super.display();


        System.out.println("override");
    }
}


