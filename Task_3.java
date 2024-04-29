//Java code for a simple ATM system with deposit, withdrawal, and balance check functionalities.

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class ATM 
{
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            account.deposit(amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            account.withdraw(amount);
        }
    }

    public void checkBalance() {
        account.checkBalance();
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2000);
        ATM atm = new ATM(bankAccount);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}





