package Ex_25_oops_abstraction_interface;

public class Lab177_interface {
    public static void main(String[] args) {
        reactangle r1 = new reactangle();
        r1.area(6,9);
        square s1 = new square();
        s1.area(6,6);

    }
}



interface shape{
    void area(int length, int breadth);
}



class reactangle implements shape{

    @Override
    public void area(int length, int breadth) {
        System.out.println(length*breadth);

    }
}

class square implements shape{

    @Override
    public void area(int side1, int side2) {
        System.out.println(side1*side2);

    }
}