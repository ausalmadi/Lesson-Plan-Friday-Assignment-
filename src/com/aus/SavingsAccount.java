package com.aus;

public class SavingsAccount {
   private static double annualInterestRate;
    private double savingsBalance;
    private double monthlyInterest;

    public SavingsAccount(double savingsBalance, double annualInterestRate) {
        this.savingsBalance = savingsBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public void calculateMonthlyInterest(){
       monthlyInterest =  ((savingsBalance* annualInterestRate)/12);
       setSavingsBalance(monthlyInterest);
    }

    public void setSavingsBalance(double monthlyInterest) {
        this.savingsBalance += monthlyInterest;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double modifyInterestRate(double annualInterestRate){
        setAnnualInterestRate(annualInterestRate);
        return annualInterestRate;

    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
}
