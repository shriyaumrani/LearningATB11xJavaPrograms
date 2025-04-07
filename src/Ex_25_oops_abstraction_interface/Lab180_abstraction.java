package Ex_25_oops_abstraction_interface;

public class Lab180_abstraction {
}


interface incomplete_interface{
    int a = 10;
    void display();
}

abstract class incomplete_abstract{
    abstract void display1();
}

class concrete implements incomplete_interface{

    @Override
    public void display() {
        System.out.println("hi");

    }
}