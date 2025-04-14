package ex_28_Enum;

public class Lab190_ENUM {
    public static void main(String[] args) {
        System.out.println(locators.page_button.getLocators());
        System.out.println(locators.page_input.getLocators());

        System.out.println(" -- ");
        System.out.println(colors.RED.getHexcode());
        System.out.println(colors.GREEN.getHexcode());


        System.out.println(" -- ");
        System.out.println(APIURL.google.getUrl());
        System.out.println(APIURL.vwo.getUrl());
        System.out.println(APIURL.katalon.getUrl());

    }
}
