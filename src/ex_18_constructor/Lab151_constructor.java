package ex_18_constructor;

public class Lab151_constructor {
    public static void main(String[] args) {
        baby b1 = new baby();
        baby b2 = new baby();
    }
}


class baby{
    String name;
    void sleep(){
        System.out.println("sleeping");
    }
    void eat(){
        System.out.println("eating");
    }
    //default constructor
    baby(){
        System.out.println("I am default constructor");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)

    }
}