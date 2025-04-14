package ex_29_wrapperclass;

public class Lab195_wrapper {
    public static void main(String[] args) {
         Mobile iphone = new Mobile("iphone17", 120000,967889067);
         Mobile samsung = new Mobile("samsung ultra", 50000, 908996756);

         iphone.calling();
         iphone.display();
         iphone.setPrice(150000);

        System.out.println(Mobile.getService());
        Mobile.switchon();
    }
}

interface simcard{
    void entercard();
}

class oldphone implements simcard {
    void calling() {
        System.out.println("dialpad");
    }

    @Override
    public void entercard() {
        System.out.println("card entered");
    }
}

class Mobile extends oldphone{
    private String name;
    private Integer phonenumber;
    private double price;
    static String service = "airtel";

    Mobile(){
        System.out.println("DC");
    }

    public Mobile(String name, double price, Integer phonenumber){
        this.name = name;
        this.phonenumber = phonenumber;
        this.price = price;

    }

    public void display(){
        System.out.println(this.name + this.phonenumber + this.price);
    }

    @Override
    void calling() {
        System.out.println("touchpad");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getService() {
        return service;
    }

    public static void setService(String service) {
        Mobile.service = service;
    }
    static void switchon(){
        System.out.println("common airplane mode");
    }
    void pricechane(){
        System.out.println("change the price");
    }
}
