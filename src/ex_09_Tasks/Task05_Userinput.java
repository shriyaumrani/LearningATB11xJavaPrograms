package ex_09_Tasks;

public class Task05_Userinput {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println("Name: " + name + '\n' + "age: "+age + '\n' + "Salary: " + salary);


    }
}
