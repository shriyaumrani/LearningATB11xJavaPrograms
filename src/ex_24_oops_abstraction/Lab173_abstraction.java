package ex_24_oops_abstraction;

public class Lab173_abstraction {
    public static void main(String[] args) {
        child c = new child();
        c.laon25k();
        c.laon();
        //father f1 = new father();  cant create as abstract class

        father f2 = new child();
    }
}


abstract class father{
    abstract void laon25k();
    void laon(){
        System.out.println("given 50k");

    }
}

class child extends father{


    @Override
    void laon25k() {
        System.out.println("child will pay the laon");
    }
}