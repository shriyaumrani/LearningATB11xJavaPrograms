package practice.OOPS;

public class practice20_super {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.display();
    }
}


class Animal{

    void display(){
        System.out.println("I am an animal");
    }

}

class Dog extends Animal{
    @Override
    void display() {
        super.display();
        System.out.println("I am a dog");

    }



}