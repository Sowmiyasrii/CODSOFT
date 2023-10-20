import java.util.Scanner;
class UserAccount {
    private double balance;
    public UserAccount(double initialBalance) {
        balance = initialBalance;
    }
public double getBalance() {
        return balance;
    }
public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false;
        }
    }
}
class ATM {
    private UserAccount userAccount;
    public ATM(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
public void displayOptions() {
        System.out.println("Welcome to the ATM:");
        System.out.println("enter your choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
public void run() {
        Scanner scan = new Scanner(System.in);
while (true) {
            displayOptions();
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
public void checkBalance() {
        double balance = userAccount.getBalance();
        System.out.println("Your account balance is " + balance);
    }
public void deposit() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit:");
        double amount = scan.nextDouble();
        userAccount.deposit(amount);
    }
 public void withdraw() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        double amount = scan.nextDouble();
        if (userAccount.withdraw(amount)) {
            System.out.println("Please take your cash:");
        }
    }
}
public class AtmInterface {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount(1000.0); 
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}