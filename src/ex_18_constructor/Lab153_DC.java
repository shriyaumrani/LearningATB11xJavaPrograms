package ex_18_constructor;

public class Lab153_DC {
    public static void main(String[] args) {
        A a = new A();
    }
}


class A{
    A(){
        System.out.println("DC");
    }
}