package Project1;

import java.util.Scanner;
/*
 * Appas Bank
 * Bank Account Parameters:
 * public Name -> String ✓
 * private Balance -> double ✓ 
 * private Date of Birth -> String ✓
 * private SSN -> int (Maybe String) ✓
 * private Account Number -> int ✓
 * 
 * Bank Account Methods:
 * Constructor 
 * Getters and Setters
 * Deposit
 * Withdraw
 * Transfer (HomeWork)
 * Balance
 * Menu
 * Compound Interest
 * Simple Interest (HomeWork)
 * Authentication Basic
 * Authentication Advanced (HomeWork?)
 * 
 * Bank Account Constructor
 * Name, Balance, SSN, Account Number, Date of Birth
 * Name, SSN
 */

public class BankAccount {

    // Bank Account Parameters
    public String name;
    private double balance;
    private String dob;
    private int ssn;
    private int accountNumber;
    public double interestRate = 0.01;
    public int period = 4; // quarterly

    // Bank Account Constructor
    public BankAccount(String name, int ssn, double balance, int accountNumber, String dob) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.dob = dob;
    }

    // Bank Account Constructor
    public BankAccount(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    // Bank Account Methods

    // Note you do need to create a getter for public variables however it is best
    // practice to create a getter for all variables

    /*
     * Getters and Setters
     */

    public String getName() {
        return this.name;
    }

    public double getbalance() {
        return this.balance;
    }

    public String getdob() {
        return this.dob;
    }

    public int getssn() {
        return this.ssn;
    }

    public int getaccountNumber() {
        return this.accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * Should only be used by during the creation of the account never after instead
     * see deposit and withdraw
     */
    public void setbalance(double balance) {
        this.balance = balance;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public void setssn(int ssn) {
        this.ssn = ssn;
    }

    public void setaccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // public void deposit(double amount) {
    // this.balance += amount;
    // }

    // public void withdraw(double amount) {
    // this.balance -= amount;
    // }
    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current balance: $" + balance);
        } else {
        overDraft(amount);

            // System.out.println("Insufficient funds!");
        }
    }

    // Overdraft method
    public void overDraft(double amount) {
        double overdraftFee = 35.0;
        if (balance < 0 || (balance - amount) < 0) {
            System.out.println("Warning: This transaction will result in an overdraft fee of $" + overdraftFee);
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue? (yes/no)");
            String input = sc.next();
            if (input.equalsIgnoreCase("yes")) {
                balance -= (amount + overdraftFee);
                System.out.println("Withdrawn: $" + amount);
                System.out.println("Overdraft fee: $" + overdraftFee);
                System.out.println("Current balance: $" + balance);
            } else {
                System.out.println("Transaction cancelled.");
            }

        } else {
            withdraw(amount);
        }
    }

    // Transfer money method
    public void transfer(BankAccount receiver, BankAccount sender, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.deposit(amount);
            sender.withdraw(amount);
        } else {
            System.out.println("Insufficient funds for transfer!");
        }
    }

    // Calculate simple interest method
    public double calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    // Create savings account method
    public void createSavingsAccount() {
       Scanner sc = new Scanner(System.in);
            System.out.println("Enter initial balance for savings account: ");
            double initialBalance = sc.nextDouble();
            if (initialBalance >= 10000) {
                System.out.println("Do you want to create a savings account? (yes/no)");
                String input = sc.next();
                if (input.equalsIgnoreCase("yes")) {
                    System.out.println("Select interest type (1 for compound, 2 for simple): ");
                    int interestType = sc.nextInt();
                    double apy = 0.0001;
                    if (interestType == 2) {
                        apy = 0.001;
                    }
                    System.out.println("Enter principal amount: ");
                    double principal = sc.nextDouble();
                    System.out.println("Enter time in years: ");
                    double time = sc.nextDouble();
                    double interest = 0.0;
                    if (interestType == 1) {
                        int n = 4; // Quarterly compounding
                        double rate = apy / n;
                        interest = principal * (Math.pow((1 + rate), (n * time))) - principal;
                    } else if (interestType == 2) {
                        double rate = apy;
                        interest = calculateSimpleInterest(principal, rate, time);
                    }
                    deposit(interest);
                    System.out.println("Interest credited: $" + interest);
                }
            }
        }
    

    // Create a mthod that will subtract a mothly fee from the balance
    // this method will take a double as a parameter
    // this method will subtract the fee from the balance
    // Netflix subscription is $12.99
    public void monthlyFee(double fee) {
        withdraw(fee); // This will call the withdraw method
    }

    // Create a method that will print a menu to the user
    // This is called a helper method / function
    public static int menu() {
        int choice;
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Welcome to Appas Bank");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer"); // HomeWork
        System.out.println("4. Balance");
        System.out.println("5. Compound Interest");
        System.out.println("6. Simple Interest"); // HomeWork
        System.out.println("7. Create Savings Account"); // HomeWork
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");
        choice = input.nextInt();

        return choice;
    }

    public void printBalance() {
        System.out.println("Your balance is: $" + this.balance);
    }

    // Create a method that will interact with the user based on their choice from
    // the menu method
    // This method will take a Bank Account as a parameter
    public static void interact(BankAccount account, BankAccount account2) {
        // get the choice from the menu method
        int choice = menu(); // create a scanner object
        Scanner input = new java.util.Scanner(System.in);
        if (choice == 1) {
            System.out.println("Please enter the amount you would like to deposit: ");
            double amount = input.nextDouble();
            account.deposit(amount);
            account.printBalance();
        } else if (choice == 2) {
            System.out.println("How much would you like to withdraw?");
            double amount = input.nextDouble();

            account.withdraw(amount);
            account.printBalance();
        } else if (choice == 3) { // place holder for choice 3
            System.out.println("How much would you like to transfer?");
            double amount = input.nextDouble();
            account.transfer(account, account2, amount);
        } else if (choice == 4) {
            account.printBalance();
        } else if (choice == 5) {
            System.out.println("How many years? (Whole numbers only)");
            int years = input.nextInt();
            account.compoundInterest(account.getbalance(), years, account.interestRate, account.period);
            account.printBalance();
        } else if (choice == 6) {// place holder for choice 6
            System.out.println("How many years? (Whole numbers only)");
            int years = input.nextInt();
            double simpleIntrest = account.calculateSimpleInterest(years, choice, years);
            account.calculateSimpleInterest(account.getbalance(), account.interestRate, years);
            System.out.println("Simple Interest: $" + simpleIntrest);
           // simulate added simple interest to balance without depositing
            account.balance += simpleIntrest;
            account.printBalance();
        } else if (choice == 7) { // place holder for choice 7
            account.createSavingsAccount();
        } else if (choice == 0) {
            System.out.println("Thank you for banking with Appas Bank");
        } else { // this would catch any invalid choices like
            System.out.println("Invalid choice");
        }
    }

    // Create a method that will calculate the interest on the balance using
    // compound interest
    // P(1 + R/n)^(nt) - P
    // A = P(1 + R/n)^(nt)
    // P = Principal
    // R = Rate
    // n = number of times interest is compounded per year (annum)
    // t = number of years
    // This method will take a double as an argument
    // This method will return a double

    // P can be this.balance or getBalance() if you would like to use a getter

    public void compoundInterest(double principal, int time, double rate, int annum) {
        double amount = principal * Math.pow(1 + (rate / annum), annum * time);
        double roundedAmount = Math.round(amount * 100.0) / 100.0;
        double compinterest = amount - principal; // A-P
        compinterest = Math.round(compinterest * 100.0) / 100;

        System.out.println("Current Rate is: " + rate + "%");
        System.out.println("Current Period is: " + annum + " times per year");
        System.out.println("Selected Time is: " + time + " years");
        System.out.println("Compound Interest after " + time + " years is: $" + compinterest);
        System.out.println("Total Amount after " + time + " years is: $" + roundedAmount);
    }

}
