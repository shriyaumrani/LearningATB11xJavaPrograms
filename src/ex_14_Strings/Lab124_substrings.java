package ex_14_Strings;

public class Lab124_substrings {
    public static void main(String[] args) {
        String anotherPallindrom = "Niagara. o roar again!";
        String roar = anotherPallindrom.substring(11,15); // strts from inex o
        // character at 0 = N, 11 - r and 14 -r
        //(11,15) - will give you substring N-1 that is till 14th index
        System.out.println(roar);

        String surname = "Manasi";
        System.out.println(surname.lastIndexOf("a"));


    }

}
