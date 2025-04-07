package ex_20_polymorphism.overriding;

public class Lab166_overridingM {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();

        animal a1 = new cat(); // dynamic dispatch
        a1.sound();
    }
}


class animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("Bark");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("Meaw");
    }
}

