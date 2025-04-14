package practice.OOPS;

import java.util.Scanner;

public class practice21_multilevelinheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.nextLine();

        dog1 dog = new dog1();
        dog.displayname(name);
        dog.display();
        dog.eat();
    }
}


class Animal1{

    void eat(){
        System.out.println("I eat animal food");
    }

}

class mammal extends Animal1{
    void display(){
        System.out.println(" I am a mammal");
    }
}

class dog1 extends mammal{
    void displayname(String name){
        System.out.println(name);

    }
}