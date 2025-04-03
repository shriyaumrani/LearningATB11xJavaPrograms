package ex_15_Stringbuilder_Stringbuffer;

public class Lab125_stringbuilder_vs_stringbuffer {
    public static void main(String[] args) {
        // Strings used 90% as they are immutable
        String name = "Shriya";
        String name1 = new String("Shriya");
        System.out.println(name);
        System.out.println(name1);

        //less than 10% used
        StringBuffer name2 = new StringBuffer("Shriya");
        StringBuilder name3 = new StringBuilder("Umrani");
        System.out.println(name2);
        System.out.println(name3);

    }
}
