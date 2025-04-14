package practice.OOPS;

import java.util.Scanner;

public class practice17_get_set_student_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter variable name");
        String name = scanner.nextLine();

        student s1 = new student();
        s1.setName("Shriya");
        System.out.println(s1.getName());


    }
}

class student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
