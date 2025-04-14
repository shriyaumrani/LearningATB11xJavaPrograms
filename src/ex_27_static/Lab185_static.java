package ex_27_static;

public class Lab185_static {
    public static void main(String[] args) {
        B.commontoall();
        System.out.println(B.b);

        System.out.println(".........");

        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);
    }
}



class B{
    static{
        System.out.println("SIB, called once, when class is loaded");
    }

    int a = 10;
    static int b = 10;
    void display(){
        System.out.println(b);
        System.out.println("non static F(n)");
    }
    static void commontoall(){
      //  System.out.println(a); cant have non static
        System.out.println("static F(n)");
    }

    //static class not useful

}