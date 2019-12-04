package com.Andrei;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Core account = new Core("001234","1234",100.0);
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        if (checkAcc()) {
            printActions();
            while (!quit) {
                System.out.println("Please chose an action: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("You have a balance of " + account.getBalance() + " euro.");
                        break;
                    case 2:
                        addBalance();
                        break;
                    case 3:
                        withdrawal();
                        break;
                    case 4:
                        quit=true;
                        break;
                }


            }
        }
    }

    public static void printActions() {
        System.out.println("1 - Check balance.");
        System.out.println("2 - Add to deposit.");
        System.out.println("3 - Make a withdrawal");
        System.out.println("4 - Finish account procedure.");
    }




    public static boolean checkAcc() {
        System.out.println("In order to proced further you need to type the following...user:001234 and pin:1234");
        System.out.print("Enter your account number: ");
        String accNumber = scanner.nextLine();
        System.out.print("Enter your pin: ");
        String accPin = scanner.nextLine();
        account.setAccountNumber("001234");
        account.setAccountPin("1234");
        if (!((accNumber.equals("001234")) && (accPin.equals("1234"))) ){
            System.out.println("Invalid user and pin. Please try again.");
            return false;
        }
        System.out.println("Correct user and pin.Proceding further...");
        return true;
    }


    public static void addBalance(){
        System.out.println("(the sum you want to introduce must be of type DOUBLE)");
        System.out.print("Please enter the deposit you want to make: ");
        double addDeposit = scanner.nextDouble();
        scanner.nextLine();
        account.addBalance(addDeposit);
    }

    public static void withdrawal(){
        System.out.println("(the sum you want to introduce must be of type DOUBLE)");
        System.out.print("Please enter the sum you want to withdraw: ");
        double subDeposit = scanner.nextDouble();
        scanner.nextLine();
        account.withdraw(subDeposit);


    }




}
