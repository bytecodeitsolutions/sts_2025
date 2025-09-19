import java.util.List;

public class BankingApplicationDemo {
    public static void main(String[] args) {
        System.out.println("=== Banking Application Demo ===\n");
        
        // Create a bank
        Bank bank = new Bank("Global Trust Bank", "GTB001", "123456789", "123 Main Street, New York");
        
        // Create managers
        Manager manager1 = new Manager("MGR001", "John Smith", "john.smith@globaltrust.com", "Customer Relations", bank);
        bank.addManager(manager1);
        
        // Create customers
        System.out.println("1. Creating customers...");
        Customer customer1 = manager1.createCustomer("CUST001", "Alice Johnson", "alice.johnson@email.com", "555-1234", "456 Oak Avenue");
        Customer customer2 = manager1.createCustomer("CUST002", "Bob Williams", "bob.williams@email.com", "555-5678", "789 Pine Street");
        
        // Create accounts
        System.out.println("\n2. Creating accounts...");
        Account aliceAccount = manager1.createAccount("ACC001", "CUST001", "SAVINGS", 5000.0);
        Account bobAccount = manager1.createAccount("ACC002", "CUST002", "CHECKING", 3000.0);
        
        // Set PINs for accounts
        aliceAccount.changePin("0000", "1234");
        bobAccount.changePin("0000", "5678");
        
        // Create ATM
        ATM atm = bank.createATM("ATM001", "Main Branch Lobby");
        
        // ATM Operations
        System.out.println("\n3. ATM Operations...");
        
        // Alice withdraws money
        System.out.println("\nAlice's withdrawal:");
        ATMTransaction withdrawal = atm.withdraw(aliceAccount, 500, "1234");
        withdrawal.printReceipt();
        
        // Bob deposits money
        System.out.println("\nBob's deposit:");
        ATMTransaction deposit = atm.deposit(bobAccount, 1000, "5678");
        deposit.printReceipt();
        
        // Balance inquiry
        System.out.println("\nAlice's balance check:");
        ATMTransaction balance = atm.checkBalance(aliceAccount, "1234");
        balance.printReceipt();
        
        // Transfer between accounts
        System.out.println("\nTransfer from Alice to Bob:");
        ATMTransaction transfer = atm.transfer(aliceAccount, bobAccount, 1000, "1234");
        transfer.printReceipt();
        
        // Manager operations
        System.out.println("\n4. Manager Operations...");
        
        // Update customer details
        System.out.println("Updating Bob's email...");
        boolean updated = manager1.updateCustomer("CUST002", "Bob Williams", "bob.new@email.com", "555-5678", "789 Pine Street");
        System.out.println("Email updated: " + updated);
        
        // View transactions
        System.out.println("\nAlice's account transactions:");
        List<Transaction> transactions = manager1.getAccountTransactions("ACC001");
        for (Transaction t : transactions) {
            System.out.println(t.getType() + ": $" + t.getAmount() + " - " + t.getDescription());
        }
        
        // Verification system demo
        System.out.println("\n5. Verification System Demo...");
        
        // PIN verification
        boolean pinVerified = VerificationSystem.verifyPin("ACC001", "1234", aliceAccount);
        System.out.println("PIN verification: " + pinVerified);
        
        // Transaction verification
        boolean transactionVerified = VerificationSystem.verifyTransaction(aliceAccount, 200, "STANDARD");
        System.out.println("Transaction verification: " + transactionVerified);
        
        // Display final balances
        System.out.println("\n6. Final Account Balances:");
        System.out.println("Alice's balance: $" + aliceAccount.getBalance());
        System.out.println("Bob's balance: $" + bobAccount.getBalance());
        
        // Display bank statistics
        System.out.println("\n7. Bank Statistics:");
        System.out.println("Total customers: " + bank.getCustomers().size());
        System.out.println("Total accounts: " + bank.getAccounts().size());
        System.out.println("Total ATMs: " + bank.getAtms().size());
        System.out.println("Total managers: " + bank.getManagers().size());
    }
}