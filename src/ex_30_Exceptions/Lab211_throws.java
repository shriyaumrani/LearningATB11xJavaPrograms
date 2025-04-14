package ex_30_Exceptions;

import java.io.File;
import java.io.FileInputStream;


public class Lab211_throws {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C://abc.txt");
        String s1 = null;
        s1.trim();
        int a = 10/0;
        File file = new File("");

        // change to exception then all exceptions will be handled
    }

    static  void t() throws Exception{
        File file = new File("");
    }
}
// any method may have throw not only main method