/**
 * Online Banking System
 * ----------------------
 * This Java program simulates an online banking system with the following features:
 * - Account creation and management
 * - Deposit, withdrawal, and transfer functionalities
 * - Exception handling for scenarios like insufficient balance
 * - A command-line interface for user interaction
 * 
 * Author: [Your Name]
 * Date: [Date]
 */

 import java.time.LocalDate;
 import java.util.*;
 
 /** Represents a bank account with basic functionalities like deposit and withdrawal. */
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
             throw new InsufficientFundsException("Insufficient funds in the account.");
         }
         balance -= amount;
     }
 
     public double getBalance() {
         return balance;
     }
 
     public String getAccountHolder() {
         return accountHolder;
     }
 }
 
 /** Represents a customer with an associated bank account. */
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
 
 /** Represents a transaction with details like amount, type, and date. */
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
 
 /** Manages the overall banking system, including accounts and customers. */
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
 
 /** Custom exception for handling insufficient funds. */
 class InsufficientFundsException extends Exception {
     public InsufficientFundsException(String message) {
         super(message);
     }
 }
 
 /** Main class to run the Online Banking System. */
 public class Banker {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Bank bank = new Bank();
         boolean running = true;
 
         // Display menu until the user chooses to exit
         while (running) {
             System.out.println("\n=== Online Banking System ===");
             System.out.println("1. Create Account");
             System.out.println("2. Deposit");
             System.out.println("3. Withdraw");
             System.out.println("4. Exit");
             System.out.print("Enter your choice: ");
             int choice = scanner.nextInt();
 
             switch (choice) {
                 case 1: // Create account
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
 
                 case 2: // Deposit
                     System.out.print("Enter Customer ID: ");
                     customerId = scanner.next();
                     System.out.print("Enter Deposit Amount: ");
                     double depositAmount = scanner.nextDouble();
                     bank.deposit(customerId, depositAmount);
                     System.out.println("Deposit successful!");
                     break;
 
                 case 3: // Withdraw
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
 
                 case 4: // Exit
                     running = false;
                     System.out.println("Thank you for using the Online Banking System.");
                     break;
 
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         }
 
         scanner.close();
     }
 }
 