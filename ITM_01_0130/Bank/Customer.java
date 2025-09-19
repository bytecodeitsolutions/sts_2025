import java.util.*;
import java.time.LocalDateTime;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private List<Account> accounts;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public Customer(String customerId, String name, String email, String phone, String address) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.accounts = new ArrayList<>();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public boolean removeAccount(String accountNumber) {
        return accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
    }
    
    public Account getAccount(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }
    
    public void updateDetails(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.updatedAt = LocalDateTime.now();
    }
    
    // Getters and Setters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public List<Account> getAccounts() { return accounts; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
}