import java.util.*;
import java.time.LocalDateTime;

public class Bank {
    private String bankName;
    private String bankCode;
    private String routingNumber;
    private String address;
    private List<Customer> customers;
    private List<Account> accounts;
    private List<Manager> managers;
    private List<ATM> atms;
    
    public Bank(String bankName, String bankCode, String routingNumber, String address) {
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.routingNumber = routingNumber;
        this.address = address;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.atms = new ArrayList<>();
    }
    
    // Customer Management
    public Customer createCustomer(String customerId, String name, String email, String phone, String address) {
        Customer customer = new Customer(customerId, name, email, phone, address);
        customers.add(customer);
        return customer;
    }
    
    public boolean removeCustomer(String customerId) {
        return customers.removeIf(customer -> customer.getCustomerId().equals(customerId));
    }
    
    public Customer getCustomer(String customerId) {
        return customers.stream()
                .filter(customer -> customer.getCustomerId().equals(customerId))
                .findFirst()
                .orElse(null);
    }
    
    // Account Management
    public Account createAccount(String accountNumber, Customer customer, String accountType, double initialBalance) {
        Account account = new Account(accountNumber, customer, accountType, initialBalance);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }
    
    public Account getAccount(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }
    
    // ATM Management
    public ATM createATM(String atmId, String location) {
        ATM atm = new ATM(atmId, location, this);
        atms.add(atm);
        return atm;
    }
    
    // Manager Management
    public void addManager(Manager manager) {
        managers.add(manager);
    }
    
    // Getters
    public String getBankName() { return bankName; }
    public String getBankCode() { return bankCode; }
    public String getRoutingNumber() { return routingNumber; }
    public String getAddress() { return address; }
    public List<Customer> getCustomers() { return customers; }
    public List<Account> getAccounts() { return accounts; }
    public List<Manager> getManagers() { return managers; }
    public List<ATM> getAtms() { return atms; }
}