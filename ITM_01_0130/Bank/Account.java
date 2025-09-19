import java.util.*;
import java.time.LocalDateTime;

public class Account {
    private String accountNumber;
    private Customer customer;
    private String accountType; // "SAVINGS", "CHECKING", "CURRENT"
    private double balance;
    private String pin;
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime lastTransactionAt;
    private List<Transaction> transactions;
    
    public Account(String accountNumber, Customer customer, String accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.pin = "0000"; // Default PIN
        this.isActive = true;
        this.createdAt = LocalDateTime.now();
        this.lastTransactionAt = LocalDateTime.now();
        this.transactions = new ArrayList<>();
    }
    
    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }
    
    public boolean changePin(String oldPin, String newPin) {
        if (verifyPin(oldPin)) {
            this.pin = newPin;
            return true;
        }
        return false;
    }
    
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            lastTransactionAt = LocalDateTime.now();
            transactions.add(new Transaction("DEPOSIT", amount, balance, "Cash deposit"));
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            lastTransactionAt = LocalDateTime.now();
            transactions.add(new Transaction("WITHDRAWAL", -amount, balance, "Cash withdrawal"));
            return true;
        }
        return false;
    }
    
    public boolean transferTo(Account recipient, double amount, String description) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            recipient.balance += amount;
            
            lastTransactionAt = LocalDateTime.now();
            recipient.lastTransactionAt = LocalDateTime.now();
            
            transactions.add(new Transaction("TRANSFER_OUT", -amount, balance, "To " + recipient.getAccountNumber() + ": " + description));
            recipient.transactions.add(new Transaction("TRANSFER_IN", amount, recipient.balance, "From " + this.accountNumber + ": " + description));
            
            return true;
        }
        return false;
    }
    
    public void closeAccount() {
        this.isActive = false;
    }
    
    public void reopenAccount() {
        this.isActive = true;
    }
    
    // Getters and Setters
    public String getAccountNumber() { return accountNumber; }
    public Customer getCustomer() { return customer; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    public boolean isActive() { return isActive; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getLastTransactionAt() { return lastTransactionAt; }
    public List<Transaction> getTransactions() { return transactions; }
    
    public void setAccountType(String accountType) { this.accountType = accountType; }
    public void setActive(boolean active) { isActive = active; }
}