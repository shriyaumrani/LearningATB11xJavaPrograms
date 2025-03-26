package ex_14_Strings;

public class Lab123_String_functions {
    public static void main(String[] args) {
        String name = "Shriya";
        //length
        System.out.println(name.length());
        // character at index
        System.out.println(name.charAt(4));
        //concatenation
        System.out.println(name.concat(" Umrani"));
        // check presence of a character
        System.out.println(name.contains("iya"));
        //ignore case
        System.out.println(name.equalsIgnoreCase("SHRIYA"));
        //check index
        System.out.println(name.indexOf("i")); // first occurance of a letter
        //replacing a character
        System.out.println(name.replace('i','I'));
        //split

        String email = "shriya@umrani@gmail@com";
        String[] split = email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        //starts with
        System.out.println(name.startsWith("i"));
        //trim : removes the spaces
        String name1 = "       Shriya";
        System.out.println(name1.trim());
        //compare to
        String s1 = "Shriya";
        System.out.println(s1.compareTo("Shriya"));
        System.out.println(s1.compareTo("shriya"));
        // starts with
        System.out.println(s1.startsWith("S"));
        // ends with
        System.out.println(s1.endsWith("a"));


    }
}
