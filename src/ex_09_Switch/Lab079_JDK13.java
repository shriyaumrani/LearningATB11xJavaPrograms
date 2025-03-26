package ex_09_Switch;

public class Lab079_JDK13 {
    public static void main(String[] args) {
        //JDK 13
        int itemcode = 001;
        switch(itemcode){
            case 001,002,003:
                System.out.println("All are electronic gadgets");
                break;
            case 004,005,006:
                System.out.println("This is mech");
                break;
            default:
                System.out.println("none");

        }
    }
}
