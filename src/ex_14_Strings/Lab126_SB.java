package ex_14_Strings;

public class Lab126_SB {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Shriya");
        name.append(" Umrani"); // concat not available
        System.out.println(name);
        System.out.println(name.reverse());
        // can be done "+"
    }
}
