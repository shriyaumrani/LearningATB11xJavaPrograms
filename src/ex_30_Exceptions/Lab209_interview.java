package ex_30_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab209_interview {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());; // checked exception
        }
    }
}
