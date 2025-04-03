package Tasks;

public class Task19_oops_class_person {
    public static void main(String[] args) {
        person p8 = new person();
        p8.laugh();
        p8.greet();
        p8.Person_location("Pune");
        p8.details("Shriya", 37, 50000);




    }
}
class person{
    String name;
    boolean is_male_or_female;
    double height;
    double weight;
    String place;
    String complexion;
    String adress;
    double salary;
    long phone_number;
    String petname;

    void laugh(){
        System.out.println("laughing");
    }
    String greet(){
        return "Hello";


    }
    void details(String name, int age, double salary){
        System.out.println("Your name is: " + name + "\nYour age is: " + age + "\n Your salary is: " + salary);
    }
    String Person_location(String place){
        System.out.println(place);
        return place;

    }


}