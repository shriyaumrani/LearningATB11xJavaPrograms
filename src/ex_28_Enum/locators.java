package ex_28_Enum;

public enum locators {
    page_button("#btn"),
    page_input("#input1");


    private String locators;
    locators(String locators){
        this.locators = locators;
    }

    public String getLocators() {
        return locators;
    }
}
