package Tasks;

import java.util.Scanner;

public class task23_days_month_year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of days");
        int days = scanner.nextInt();

        System.out.println("Number of days: " + days);

        int year = days/365;

        int remaining_days = days%365;

        int months = remaining_days/30;


        int day = remaining_days%30;


        System.out.println("years: " + year + "," + " months: " + months + "," + " days: " + day);
    }
}


