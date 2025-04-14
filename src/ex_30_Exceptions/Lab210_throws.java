package ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Lab210_throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
// announces publically and given to main method to handle