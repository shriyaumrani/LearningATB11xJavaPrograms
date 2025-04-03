package multilevel_inheritance;

public class Lab162_multilevel {
    public static void main(String[] args) {
        son amit = new son();
        amit.s();
        amit.f();
        amit.gf();
        amit.home();
        System.out.println(amit.gold_gf);

        Grandfather G3 = new son();
        G3.home();
    }
}
