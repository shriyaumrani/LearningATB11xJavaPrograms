package Ex_25_oops_abstraction_interface;

public class Lab178_cars {
    public static void main(String[] args) {

        car c1 = new car();
        c1.drive();

    }
}

interface engine{
    void startengine();
    void stopengine();
    default void test(){
        System.out.println("concrete complete");
    }
}

interface Break{
    void apply_break();
}

class car implements engine,Break{

    void drive(){
        startengine();
        stopengine();
        apply_break();
        test();
    }

    @Override
    public void apply_break() {
        System.out.println("apply breaks");

    }

    @Override
    public void startengine() {
        System.out.println("start engine");

    }

    @Override
    public void stopengine() {
        System.out.println("stop engine");

    }
}

