package ex_23_oops_ssuper;

public class Lab172_super {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.display();
        d1.sound();


    }
}


class GOD{
    void sound(){
        System.out.println("God!");
    }
}
class Animal extends GOD{
    protected String color = "white";

    void sound(){
        System.out.println("Animal Sound!");
        super.sound();
    }
}

class dog extends Animal{
    private String color = "black";

    dog(){
       // super();
    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}