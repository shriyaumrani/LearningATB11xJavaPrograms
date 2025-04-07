package Tasks;

import java.util.Scanner;

public class Task21_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        double withdrawl_amount = scanner.nextDouble();

        ATM myatm = new ATM(100000);
        myatm.displaybalance();
        myatm.withdrawl(withdrawl_amount);
    }

}

class ATM{
    private double accountbalance;

    public ATM(double initialbalace){
        this.accountbalance = initialbalace;
    }
    public void withdrawl(double amount){
        if(amount <= 0){
            System.out.println("Error! The amount should be greater than 0");
        }else if (amount %100 !=0) {
            System.out.println("The amount should be multiple of 100");
        } else if (amount > accountbalance) {
            System.out.println("Insufficient balance");
            
        }else {
            accountbalance -= amount;
            System.out.println("You updated account balance is: " + accountbalance);

        }

        }
    public void displaybalance(){
        System.out.println("Your account balance is: " + accountbalance);

    }





}