package ex_03_Literal;

public class Lab025_literals_p4 {
    public static void main(String[] args) {
        char c1 = 'A';
//        char c2 = "A" it is not a character. It is a string as closed by ""
        char c2 = '@';
        char c3 = '_';
        char c4 = '&';
        char c5 = '2';
        char c6 = ' '; // blank space is also a character

        //Escape characters

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("Hi! This is a first line\nTHis is the second line");
        System.out.println("Hi! This is a first line"+new_line+"This is second line");

        char c8 = 'A';
        System.out.println(c8);

    }
}
