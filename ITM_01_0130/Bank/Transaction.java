import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private String type;
    private double amount;
    private double balanceAfter;
    private String description;
    private LocalDateTime timestamp;
    
    public Transaction(String type, double amount, double balanceAfter, String description) {
        this.transactionId = generateTransactionId();
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.description = description;
        this.timestamp = LocalDateTime.now();
    }
    
    private String generateTransactionId() {
        return "TXN" + System.currentTimeMillis() + (int)(Math.random() * 1000);
    }
    
    // Getters
    public String getTransactionId() { return transactionId; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public double getBalanceAfter() { return balanceAfter; }
    public String getDescription() { return description; }
    public LocalDateTime getTimestamp() { return timestamp; }
}