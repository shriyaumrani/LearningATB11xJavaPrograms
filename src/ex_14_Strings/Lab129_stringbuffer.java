package ex_14_Strings;

public class Lab129_stringbuffer {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Java");
        name.append(" Programming");
        System.out.println(name);
        name.delete(5,16);
        System.out.println(name);
        name.replace(0,4,"Python");
        System.out.println(name);

    }
}
