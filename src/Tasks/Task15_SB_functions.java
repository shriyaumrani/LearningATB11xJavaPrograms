package Tasks;

public class Task15_SB_functions {
    public static void main(String[] args) {
        // 1. creating a string
        StringBuffer name = new StringBuffer("Shriya");
        System.out.println(name);
        // 2. append
        name.append("  Umrani");
        System.out.println(name);
        //3.replace characters
        name.replace(0,3,"Pr"); // end index-1
        System.out.println(name);
        //4. insert
        name.insert(6, "P");
        System.out.println(name);
        //5. delete
        name.delete(0,6);
        System.out.println(name);
        //6. reverese
        name.reverse();
        System.out.println(name);
        //7. capacity
        StringBuilder sb = new StringBuilder("Welcome to the Show!");
        sb.append(" We are happy");
        System.out.println(sb.capacity());
        //8. ensure capacity
        sb.ensureCapacity(32);
        System.out.println(sb.capacity());
        //9. char at
        System.out.println(sb.charAt(9));
        //10. set char at: changes a character at perticular position
        sb.setCharAt(0,'s');
        System.out.println(sb);
        //11. length
        System.out.println(name.length());
        //12. substring
        StringBuilder student = new StringBuilder("Shriya P Umrani");
        System.out.println(student.substring(9));
        //13. extract substring within a range
        System.out.println(student.substring(0,6));
        //14. Convert a stringbuilder to string
        StringBuilder surname = new StringBuilder("Umrani");
        String Str = surname.toString();
        System.out.println(Str);
        //15. Reduces capacity to reduce the content
        StringBuilder sb1 = new StringBuilder(30);
        System.out.println(sb1.capacity());
        sb1.append("Shriya");
        System.out.println(sb1);
        sb1.trimToSize();
        System.out.println(sb1.capacity());

    }
}
