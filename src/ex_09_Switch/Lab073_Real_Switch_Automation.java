package ex_09_Switch;

public class Lab073_Real_Switch_Automation {
    public static void main(String[] args) {
        String browser = args[0];
        System.out.println(browser);
        switch(browser){
            case"chrome":
                System.out.println("starting the chrome");
                System.out.println("...........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case"firefox":
                System.out.println("starting the firefox browser");
                //further code to start the firefox
                //webdriver driver = new Firefox(); Selenium code
                break;
            case "edge":
                System.out.println("execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this");


        }
    }
}
