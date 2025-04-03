package Tasks;

public class Task20_constructor {
    public static void main(String[] args) {
        Person4 p8 = new Person4();
        p8.name = "Shriya";

        // Object with parameterized constructor (Fixed phone_no to long)
        Person4 p9 = new Person4("Shriya", 37, "Pune", 988235897L, false);

        p9.eat();
        p9.sleep();
        p9.details();  // No need to pass arguments

    }
}
class Person4 {
    String name;
    int age;
    String address;
    long phone_no;  // Changed from int to long
    boolean is_male;

    // Default constructor
    Person4() {
    }

    // Parameterized constructor
    Person4(String name, int age, String address, long phone_no, boolean is_male) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone_no = phone_no;
        this.is_male = is_male;
    }

    // Methods
    void eat() {
        System.out.println(this.name + " is eating");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    void details() {  // Removed parameters since they weren't being used
        System.out.println("Your name: " + this.name);
        System.out.println("Your age: " + this.age);
        System.out.println("Your phone no: " + this.phone_no);
    }

}
