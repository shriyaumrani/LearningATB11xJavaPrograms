package ex_22_accessModifiers.police;

public class Lab_170 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.getflat();


    }
}

class Father{
    private int gold =10;
    protected String flat = "3-bhk";
    int car =1;
}

class Son extends Father {


    void getflat() {
        System.out.println(flat); // flat can be accessed
    }

    void getgold(){
      //  System.out.println(gold); cant be accesssed as private
    }
}