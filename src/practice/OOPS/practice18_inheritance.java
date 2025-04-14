package practice.OOPS;

public class practice18_inheritance {
    public static void main(String[] args) {
        dog d1 = new dog("jimi", 4, false);
        d1.eat();
        d1.dance();

    }
}


class animal{
    String name;
    int legs;
    boolean isherbivores;

    animal(String name, int legs, boolean isherbivores){
        this.name = name;
        this.legs = legs;
        this.isherbivores = isherbivores;

    }

    void eat(){
        System.out.println("Animals can eat");
    }
}

class dog extends animal{

    dog(String name, int legs, boolean isherbivores){
        super(name, legs, isherbivores);
    }


    void dance(){
        System.out.println("I can dance");

    }
}