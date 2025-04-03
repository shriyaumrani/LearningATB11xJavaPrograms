package hierarchial;

public class Lab163_hierarchial {
    public static void main(String[] args) {
        Father F1 = new Father();
        Shriya S1 = new Shriya();
        S1.home();
        S1.home1();

        System.out.println("..........");

        malhar M1 = new malhar();
        M1.home();
        M1.home();

        System.out.println(".......");

        Arjun A1 = new Arjun();
        A1.home();
        A1.home3();
    }
}
class Father{
    void home(){
        System.out.println("3BHK");
    }

}
class Shriya extends Father{
    void home1(){
        System.out.println("2BHK");

    }
}
class malhar extends Father{
    void home2(){
        System.out.println("3BHK");
    }
}
class Arjun extends Father{
    void home3(){
        System.out.println("4BHK");
    }
}