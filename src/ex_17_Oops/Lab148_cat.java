package ex_17_Oops;

public class Lab148_cat {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2;    // only ref no object
        new cat(); // only object no ref

        c1.running();
      //  c2.running(); // not possible as there is no object
        new cat().running();
        System.out.println(new cat().name); // null value

    }
}
class cat{
    String name; // by default null value
    String colour;

    void running(){
        System.out.println("running");
    }

}
