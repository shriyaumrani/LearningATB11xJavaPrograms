package ex_09_Tasks;

public class Task03_Gradecalculator {
    public static void main(String[] args) {
        String marks = args[0];
        System.out.println("Marks entered: " + marks);
        System.out.println(marks instanceof String);

        int score = Integer.parseInt(marks);
        String result = (score >= 90 && score <= 100) ? "A"
                : (score >= 80 && score <= 89) ? "B"
                : (score >= 70 && score <= 79) ? "C"
                : (score >= 60 && score <= 69) ?"D"
                : "F";

        System.out.println("Your Garde is: " + result);
    }

    }

