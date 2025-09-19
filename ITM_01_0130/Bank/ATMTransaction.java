import java.time.LocalDateTime;

public class ATMTransaction {
    private String transactionId;
    private String type;
    private double amount;
    private String message;
    private boolean success;
    private LocalDateTime timestamp;
    
    public ATMTransaction(String type, double amount, String message, boolean success) {
        this.transactionId = generateTransactionId();
        this.type = type;
        this.amount = amount;
        this.message = message;
        this.success = success;
        this.timestamp = LocalDateTime.now();
    }
    
    private String generateTransactionId() {
        return "ATM" + System.currentTimeMillis();
    }
    
    public void printReceipt() {
        System.out.println("=== ATM Receipt ===");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Type: " + type);
        System.out.println("Amount: $" + String.format("%.2f", amount));
        System.out.println("Status: " + (success ? "SUCCESS" : "FAILED"));
        System.out.println("Message: " + message);
        System.out.println("Time: " + timestamp);
        System.out.println("==================");
    }
    
    // Getters
    public String getTransactionId() { return transactionId; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public String getMessage() { return message; }
    public boolean isSuccess() { return success; }
    public LocalDateTime getTimestamp() { return timestamp; }
}