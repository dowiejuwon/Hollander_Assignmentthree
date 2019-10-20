package com.projectthree;

import java.util.Scanner;

class SavingsAccount{
    public static double annualInterestRate = 0;

    private double savingsBalance;

    public SavingsAccount(double balance){
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest(){
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += interest;
    }

    public static void modifyInterestRate(double newValue){
        annualInterestRate = newValue;
    }

    public void displayBalance(){
        System.out.printf("$%.2f", this.savingsBalance);
    }

}

public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(4);
        System.out.println("          (Saver1      Saver2)");

        for (int i = 1; i <= 12; ++i) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + i + "   ");
            saver1.displayBalance();
            System.out.print("    ");
            saver2.displayBalance();
            System.out.println();
        }
        System.out.println();
        System.out.println("5% interest rate:");
        SavingsAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        for (int i = 13; i <= 13; ++i)
        System.out.print("Month " + i + "   " );
        saver1.displayBalance();
        System.out.print("   ");
        saver2.displayBalance();

    }
}