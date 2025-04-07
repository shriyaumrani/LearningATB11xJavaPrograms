package Ex_25_oops_abstraction_interface;

public class Lab176_multiple_inheritance_interface {
    public static void main(String[] args) {
        child c1 = new child();
        c1.money();
    }
}


interface mother{
    void money();
}
interface father{
    void money();
}
class child implements mother,father {

    @Override
    public void money() {
        System.out.println("child money");
    }
}