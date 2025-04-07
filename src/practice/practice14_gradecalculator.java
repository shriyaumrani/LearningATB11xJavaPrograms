package practice;

import java.util.Scanner;

public class practice14_gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = scanner.nextInt();

        GradeCalculator gradeCalculator = new GradeCalculator(marks);
        gradeCalculator.validMarks();

        String grade = gradeCalculator.getGrade();
        System.out.println("The final grade is: " + grade);
    }
}

class GradeCalculator {
    private int marks;
    private String grade;

    public GradeCalculator(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        if (marks > 0 && marks <= 100) {
            if (marks >= 90) {
                grade = "A+";
            } else if (marks >= 80) {
                grade = "A";
            } else if (marks >= 70) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 50) {
                grade = "D";
            } else if (marks >= 40) {
                grade = "E";
            } else {
                grade = "Fail";
            }
        } else {
            grade = "Invalid Marks";
        }
        return grade;
    }

    public void validMarks() {
        if (marks <= 0 || marks > 100) {
            System.out.println("Please enter valid marks between 1 and 100.");
        }
    }
}


