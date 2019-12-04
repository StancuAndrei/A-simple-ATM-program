package com.Andrei;

public class Core {
    private String accountNumber ;
    private String accountPin;
    private double balance;

    public Core(String accountNumber, String accountPin, double balance) {
        this.accountNumber = accountNumber;
        this.accountPin = accountPin;
        this.balance = balance;
    }

    public void printBalance(){
        System.out.println("You have " + this.balance + " euro in your account.");
    }

    public  void  addBalance(double add){
        this.balance += add;
        System.out.println("You have deposited " + add + " euros in your account. New balance is " + this.balance);

    }
    public  void withdraw(double withdraw){
        if (this.balance - withdraw < 0){
            System.out.println("Your deposit is " + this.balance +" .You cannot make a withdrawal");
        }else{
            this.balance-=withdraw;
            System.out.println("Withdrawal of " + withdraw + " proccesed. Remaining balance: " + this.balance);
        }
    }

    public String setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this.accountNumber;
    }

    public String setAccountPin(String accountPin) {
        this.accountPin = accountPin;
        return this.accountPin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountPin() {
        return accountPin;
    }

    public double getBalance() {
        return balance;
    }
}
