package ex_27_static;

public class Lab186_real {

    public static void main(String[] args) {
        System.out.println(ATB.courseName);
        ATB.assignments();
        ATB.joinclass();

        ATB shriya = new ATB();
        shriya.setName("shriya");
        shriya.setPhonenumber("997898076");

        System.out.println(shriya.getName());
        System.out.println(shriya.getPhonenumber());
        shriya.assignmentcheck();
    }
}


class ATB{
    static{
        System.out.println("load the class? I will excute");
    }
    {
        System.out.println("IIB - callled when object created");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    private String name;//non static
    private String phonenumber;
    static String courseName = "ATB11X";

    static void assignments(){
        //static methods cant access noon static methods
      //  System.out.println(phonenumber);
        System.out.println("Do assignments");


    }

    static void joinclass(){
        System.out.println("class joind");
    }

    void assignmentcheck(){
        System.out.println("it is different");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}