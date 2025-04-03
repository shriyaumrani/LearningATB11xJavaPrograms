package ex_17_Oops;

public class Lab147_oopsP2 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.learning();



    }
}

class Student{
    String name;
    int roll_no;

    void learning(){
        System.out.println("Student is learning");
    }



}
