package ex_27_static;

public class Lab184_static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        ref1.display();
        //System.out.println(ref1.b);
        System.out.println(A.b);
        A.b = 45;

        System.out.println(".....");

        A ref2 = new A(20);
        ref2.display();
        //System.out.println(ref2.b);
        System.out.println(A.b);

        System.out.println(".....");

        A ref3 = new A(20);
        System.out.println(A.b);
    }
}


class A{

    int a;
    static int b = 20;

    A(int a){
        this.a = a;
    }
    void display(){
        System.out.println(this.a);
    }
}