package ex_27_static;

public class Lab187_automation {

    public static void main(String[] args) {
        automation t1 = new automation();
        System.out.println(automation.driver);

        automation t2 = new automation();
        automation t3 = new automation();

        System.out.println(t2.driver);
        System.out.println(t3.driver);
    }
}




class automation{
    static String driver = "chrome";
}