package ex_27_static;

public class Lab183_Static_IIB {
    public static void main(String[] args) {
        p p1 = new p();
        p p2 = new p();
        p p3 = new p();

        // IIB - 3 objects
        // SIB - 1 object.. it is class specific


    }
}


class p{
    p(){
        System.out.println("DC");
    }
    static{
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }


}