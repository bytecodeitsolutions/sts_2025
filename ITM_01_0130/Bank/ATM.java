import java.util.*;
import java.time.LocalDateTime;

public class ATM {
    private String atmId;
    private String location;
    private Bank bank;
    private double availableCash;
    private boolean isOnline;
    private Map<String, Integer> failedAttempts;
    
    public ATM(String atmId, String location, Bank bank) {
        this.atmId = atmId;
        this.location = location;
        this.bank = bank;
        this.availableCash = 100000.0; // Default cash available
        this.isOnline = true;
        this.failedAttempts = new HashMap<>();
    }
    
    public boolean isCardValid(String cardNumber) {
        // In real implementation, this would validate card format and bank affiliation
        return cardNumber != null && cardNumber.length() == 16;
    }
    
    public boolean verifyPin(Account account, String pin) {
        String accountNumber = account.getAccountNumber();
        
        // Track failed attempts
        int attempts = failedAttempts.getOrDefault(accountNumber, 0);
        
        if (attempts >= 3) {
            System.out.println("Card blocked due to too many failed attempts");
            return false;
        }
        
        if (account.verifyPin(pin)) {
            failedAttempts.remove(accountNumber);
            return true;
        } else {
            failedAttempts.put(accountNumber, attempts + 1);
            return false;
        }
    }
    
    public ATMTransaction withdraw(Account account, double amount, String pin) {
        if (!verifyPin(account, pin)) {
            return new ATMTransaction("WITHDRAWAL", 0, "Invalid PIN", false);
        }
        
        if (!account.isActive()) {
            return new ATMTransaction("WITHDRAWAL", 0, "Account is inactive", false);
        }
        
        if (amount > availableCash) {
            return new ATMTransaction("WITHDRAWAL", 0, "ATM insufficient funds", false);
        }
        
        if (account.withdraw(amount)) {
            availableCash -= amount;
            return new ATMTransaction("WITHDRAWAL", amount, "Withdrawal successful", true);
        } else {
            return new ATMTransaction("WITHDRAWAL", 0, "Insufficient account balance", false);
        }
    }
    
    public ATMTransaction deposit(Account account, double amount, String pin) {
        if (!verifyPin(account, pin)) {
            return new ATMTransaction("DEPOSIT", 0, "Invalid PIN", false);
        }
        
        if (!account.isActive()) {
            return new ATMTransaction("DEPOSIT", 0, "Account is inactive", false);
        }
        
        if (account.deposit(amount)) {
            availableCash += amount;
            return new ATMTransaction("DEPOSIT", amount, "Deposit successful", true);
        } else {
            return new ATMTransaction("DEPOSIT", 0, "Invalid deposit amount", false);
        }
    }
    
    public ATMTransaction checkBalance(Account account, String pin) {
        if (!verifyPin(account, pin)) {
            return new ATMTransaction("BALANCE", 0, "Invalid PIN", false);
        }
        
        if (!account.isActive()) {
            return new ATMTransaction("BALANCE", 0, "Account is inactive", false);
        }
        
        return new ATMTransaction("BALANCE", account.getBalance(), "Balance inquiry successful", true);
    }
    
    public ATMTransaction transfer(Account fromAccount, Account toAccount, double amount, String pin) {
        if (!verifyPin(fromAccount, pin)) {
            return new ATMTransaction("TRANSFER", 0, "Invalid PIN", false);
        }
        
        if (!fromAccount.isActive() || !toAccount.isActive()) {
            return new ATMTransaction("TRANSFER", 0, "One or both accounts are inactive", false);
        }
        
        if (fromAccount.transferTo(toAccount, amount, "ATM Transfer")) {
            return new ATMTransaction("TRANSFER", amount, "Transfer successful", true);
        } else {
            return new ATMTransaction("TRANSFER", 0, "Insufficient balance or invalid amount", false);
        }
    }
    
    public void refillCash(double amount) {
        availableCash += amount;
    }
    
    // Getters
    public String getAtmId() { return atmId; }
    public String getLocation() { return location; }
    public double getAvailableCash() { return availableCash; }
    public boolean isOnline() { return isOnline; }
}