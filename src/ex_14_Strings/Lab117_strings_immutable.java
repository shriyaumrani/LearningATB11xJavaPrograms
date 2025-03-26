package ex_14_Strings;

public class Lab117_strings_immutable {
    public static void main(String[] args) {
//        String name = "Shriya";
//        name.toLowerCase(); // strings are immutable. We are still referring to old reference
//        // old ref. name. There are 2 strings in old reference shriya and SHRIYA.
//        // SHRIYA is not assigned to any reference hence output is still "Shriya"
//        System.out.println(name);

        String name = "Shriya";
        name = name.toUpperCase();
        // now we have assigned it to new reference hence the output is "SHRIYA"
        System.out.println(name);
    }
}
