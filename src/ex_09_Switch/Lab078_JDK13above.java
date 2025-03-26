package ex_09_Switch;

public class Lab078_JDK13above {
    public static void main(String[] args) {
        //in JDK 13 and above
        int codeitem = 001;
        switch (codeitem){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            default -> System.out.println("default");
        }
    }
}
