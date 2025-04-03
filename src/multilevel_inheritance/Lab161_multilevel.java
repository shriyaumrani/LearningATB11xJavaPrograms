package multilevel_inheritance;

public class Lab161_multilevel {
    public static void main(String[] args) {
//        son S1 = new Grandfather();  reverse not possible
//        father F1 = new Grandfather();
//        son S2 = new father();

        Grandfather G1 = new father(); // dynamic dispatch gf reference and father object - same function is called
        G1.gf();
        G1.home();

        Grandfather G2 = new son(); //
        G2.gf();
        G2.home();


    }
}
