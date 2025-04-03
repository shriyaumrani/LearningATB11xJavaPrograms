package ex_19_oops_inheritance;

public class Lab158_inheritance {
    public static void main(String[] args) {
        father f1= new father();
        System.out.println(f1.gold);
        f1.flat();
     //   f1.flat1() cant access sons property

        System.out.println("......");

        son s1 = new son();
        System.out.println(s1.gold); // can access fathers gold
        s1.flat(); // can access fathers flat
        s1.flat1();

    }
}
    class father {
        int gold = 1000;

        void flat() {
            System.out.println("2 BHK- flat");
        }
    }
    class son extends father{
    // it acquires attributes as wel as properties of father
    void flat1(){
        System.out.println("3 bhk - flat");

        }

    }
