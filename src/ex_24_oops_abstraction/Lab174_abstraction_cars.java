package ex_24_oops_abstraction;

public class Lab174_abstraction_cars {
    public static void main(String[] args) {
        wagonR W1 = new wagonR();
        W1.drive();
    }
}


abstract class engine{
    abstract void startEngine();
    abstract void stopEngine();

    void normal(){
        System.out.println("normal function");
    }
}

class wagonR extends engine{

    @Override
    void startEngine() {
        System.out.println("starting the car");

    }

    @Override
    void stopEngine() {
        System.out.println("stopping the car");


    }
    void drive(){
        startEngine();
        stopEngine();
    } // complate class
}