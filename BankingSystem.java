// Online Banking System in Java

// Account Class
class Account {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    public Account(String accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Customer Class
class Customer {
    private String name;
    private String customerId;
    private Account account;

    public Customer(String name, String customerId, Account account) {
        this.name = name;
        this.customerId = customerId;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Account getAccount() {
        return account;
    }
}

// Transaction Class
import java.time.LocalDate;

class Transaction {
    private double amount;
    private String transactionType;
    private LocalDate date;

    public Transaction(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.date = LocalDate.now();
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public LocalDate getDate() {
        return date;
    }
}

// Bank Class
import java.util.*;

class Bank {
    private Map<String, Customer> customers = new HashMap<>();

    public void createAccount(String customerId, String name, String accountNumber, double initialDeposit) {
        Account account = new Account(accountNumber, name, initialDeposit);
        Customer customer = new Customer(name, customerId, account);
        customers.put(customerId, customer);
    }

    public Customer getCustomer(String customerId) {
        return customers.get(customerId);
    }

    public void deposit(String customerId, double amount) {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            customer.getAccount().deposit(amount);
        }
    }

    public void withdraw(String customerId, double amount) throws InsufficientFundsException {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            customer.getAccount().withdraw(amount);
        }
    }
}

// InsufficientFundsException Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Main Program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        ;
        Bank bank = new Bank();
        boolean running = true;

        while (running) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.next();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter Initial Deposit: ");
                    double initialDeposit = scanner.nextDouble();
                    bank.createAccount(customerId, name, accountNumber, initialDeposit);
                    System.out.println("Account created successfully!");
                    break;
                case 2:
                    System.out.print("Enter Customer ID: ");
                    customerId = scanner.next();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(customerId, depositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    System.out.print("Enter Customer ID: ");
                    customerId = scanner.next();
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        bank.withdraw(customerId, withdrawAmount);
                        System.out.println("Withdrawal successful!");
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
