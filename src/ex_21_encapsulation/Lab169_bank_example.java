package ex_21_encapsulation;

public class Lab169_bank_example {
    public static void main(String[] args) {
        ICICIbank icicibank = new ICICIbank("Shriya", 50000, "shriya.umrani", "user123");
        System.out.println(icicibank.getBalance());
        System.out.println(icicibank.getName());
        System.out.println(icicibank.getUsername());
        System.out.println(icicibank.getPassword());
        icicibank.setPassword("shriya@123");
        System.out.println("Updated password: " + icicibank.getPassword());
        icicibank.setBalance(79000,true);
        System.out.println(icicibank.getBalance());



    }
}


class ICICIbank {

    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String username;
    private String password;
    private double balance;
    private String name;

    public ICICIbank(String name, double balance, String username, String password) {
        this.name = name;
        this.balance = balance;
        this.username = username;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password){
        this.password= password;
        return this.password;
    }

    public void setBalance(double balance, boolean iscashier) {
        if (iscashier) {
            this.balance = balance;
        } else {
            System.out.println("not allowed to change");
        }
    }

}