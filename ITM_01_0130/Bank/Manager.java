import java.util.*;
import java.time.LocalDateTime;

public class Manager {
    private String managerId;
    private String name;
    private String email;
    private String department;
    private Bank bank;
    private List<String> permissions;
    
    public Manager(String managerId, String name, String email, String department, Bank bank) {
        this.managerId = managerId;
        this.name = name;
        this.email = email;
        this.department = department;
        this.bank = bank;
        this.permissions = Arrays.asList("CREATE_CUSTOMER", "UPDATE_CUSTOMER", "DELETE_CUSTOMER", 
                                       "CREATE_ACCOUNT", "UPDATE_ACCOUNT", "CLOSE_ACCOUNT", 
                                       "VIEW_TRANSACTIONS", "OVERRIDE_TRANSACTIONS");
    }
    
    public boolean canPerformAction(String action) {
        return permissions.contains(action);
    }
    
    public Customer createCustomer(String customerId, String name, String email, String phone, String address) {
        if (canPerformAction("CREATE_CUSTOMER")) {
            return bank.createCustomer(customerId, name, email, phone, address);
        }
        return null;
    }
    
    public boolean updateCustomer(String customerId, String name, String email, String phone, String address) {
        if (canPerformAction("UPDATE_CUSTOMER")) {
            Customer customer = bank.getCustomer(customerId);
            if (customer != null) {
                customer.updateDetails(name, email, phone, address);
                return true;
            }
        }
        return false;
    }
    
    public boolean deleteCustomer(String customerId) {
        if (canPerformAction("DELETE_CUSTOMER")) {
            return bank.removeCustomer(customerId);
        }
        return false;
    }
    
    public Account createAccount(String accountNumber, String customerId, String accountType, double initialBalance) {
        if (canPerformAction("CREATE_ACCOUNT")) {
            Customer customer = bank.getCustomer(customerId);
            if (customer != null) {
                return bank.createAccount(accountNumber, customer, accountType, initialBalance);
            }
        }
        return null;
    }
    
    public boolean updateAccount(String accountNumber, String accountType, Boolean isActive) {
        if (canPerformAction("UPDATE_ACCOUNT")) {
            Account account = bank.getAccount(accountNumber);
            if (account != null) {
                if (accountType != null) account.setAccountType(accountType);
                if (isActive != null) account.setActive(isActive);
                return true;
            }
        }
        return false;
    }
    
    public boolean closeAccount(String accountNumber) {
        if (canPerformAction("CLOSE_ACCOUNT")) {
            Account account = bank.getAccount(accountNumber);
            if (account != null && account.getBalance() == 0) {
                account.closeAccount();
                return true;
            }
        }
        return false;
    }
    
    public List<Transaction> getAccountTransactions(String accountNumber) {
        if (canPerformAction("VIEW_TRANSACTIONS")) {
            Account account = bank.getAccount(accountNumber);
            if (account != null) {
                return account.getTransactions();
            }
        }
        return new ArrayList<>();
    }
    
    // Getters
    public String getManagerId() { return managerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public List<String> getPermissions() { return permissions; }
}