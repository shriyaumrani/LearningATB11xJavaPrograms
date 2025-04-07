package ex_20_polymorphism.overloading;

public class Lab165_reallife {
    public static void main(String[] args) {
        home h1 = new home();
        h1.task(4);
        h1.task(4,5);
        h1.task(4,5,6);
    }

}


class home{
    void task(int a){
        System.out.println(a);
    }
    void task(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void task(int a, int b){
        System.out.println(a+b);

    }
}