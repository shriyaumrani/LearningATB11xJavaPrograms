package multilevel_inheritance;

public class Lab160_multilevel {
    public static void main(String[] args) {
        Grandfather G1 = new Grandfather();
        G1.gf();

        System.out.println("......");

        father F1 = new father();
        F1.f();
        F1.gf();
        F1.home();
        System.out.println(F1.gold_gf);

        System.out.println(".......");

        son s1 = new son();
        s1.s();
        s1.gf();
        s1.f();
        s1.home();
        System.out.println(s1.gold_gf);



    }

}
