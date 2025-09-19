# Banking Application System

## Overview
This is a comprehensive banking application system built in Java that manages customers, accounts, managers, and ATM operations with robust verification and security features.

## System Components

### 1. Bank Class
- **Purpose**: Central system managing all banking entities
- **Key Features**:
  - Manages customers, accounts, managers, and ATMs
  - Provides creation and retrieval methods for all entities
  - Stores bank-wide information (name, code, routing number)

### 2. Customer Class
- **Purpose**: Represents bank customers
- **Key Features**:
  - Personal information management (name, email, phone, address)
  - Account association (one-to-many relationship)
  - Creation and update timestamps
  - Account management methods

### 3. Account Class
- **Purpose**: Represents customer bank accounts
- **Key Features**:
  - Account number, type, and balance management
  - PIN-based security
  - Transaction history tracking
  - Active/inactive status
  - Core banking operations (deposit, withdraw, transfer)

### 4. Manager Class
- **Purpose**: Administrative users with permissions
- **Key Features**:
  - Role-based permissions system
  - Customer and account management capabilities
  - Transaction viewing permissions
  - Account closure and modification rights

### 5. ATM Class
- **Purpose**: Automated teller machine operations
- **Key Features**:
  - Cash management and availability
  - PIN verification with attempt tracking
  - Standard ATM operations (withdraw, deposit, balance, transfer)
  - Location and status management

### 6. Transaction Classes
- **Transaction**: Base class for all bank transactions
- **ATMTransaction**: Specialized ATM transaction with receipt generation

### 7. VerificationSystem
- **Purpose**: Security and authentication layer
- **Key Features**:
  - PIN verification with attempt tracking
  - Transaction verification based on amount
  - Verification code generation
  - Account locking after failed attempts
  - Secure PIN hashing

## Class Relationships

```
Bank (1) ----<*> Customer
Bank (1) ----<*> Account
Bank (1) ----<*> Manager
Bank (1) ----<*> ATM
Customer (1) ----<*> Account
Account (1) ----<*> Transaction
ATM ----> Account (uses for transactions)
Manager ----> Bank (works for)
```

## Key Functionalities

### Customer Operations
- Create new customers
- Update customer details
- Delete customers (cascade to accounts)
- View customer accounts

### Account Operations
- Create accounts linked to customers
- Deposit and withdraw funds
- Transfer between accounts
- Change PIN
- Close/reopen accounts
- View transaction history

### Manager Operations
- Create customers and accounts
- Update customer and account details
- Close accounts (zero balance required)
- View all transactions
- Override certain operations

### ATM Operations
- Withdraw cash with PIN verification
- Deposit cash with PIN verification
- Check balance
- Transfer funds between accounts
- Print receipts
- Track failed attempts

### Verification System
- PIN verification with 3-attempt limit
- Transaction verification based on amount
- High-value transaction additional checks
- Account locking after failed attempts
- Secure PIN storage

## Security Features

1. **PIN Security**:
   - Encrypted PIN storage
   - 3-attempt limit before card blocking
   - PIN change functionality

2. **Transaction Verification**:
   - Basic verification for small amounts
   - Additional checks for high-value transactions
   - Daily transfer limits

3. **Access Control**:
   - Manager role-based permissions
   - Account status checking
   - Active/inactive account management

## Usage Examples

### Creating a Banking System
```java
// Create bank
Bank bank = new Bank("Global Trust Bank", "GTB001", "123456789", "123 Main Street");

// Create manager
Manager manager = new Manager("MGR001", "John Smith", "john@bank.com", "Customer Service", bank);
bank.addManager(manager);

// Create customer and account
Customer customer = manager.createCustomer("CUST001", "Alice Johnson", "alice@email.com", "555-1234", "456 Oak Avenue");
Account account = manager.createAccount("ACC001", "CUST001", "SAVINGS", 5000.0);
account.changePin("0000", "1234");
```

### ATM Operations
```java
// Create ATM
ATM atm = bank.createATM("ATM001", "Main Branch");

// Perform transactions
ATMTransaction withdrawal = atm.withdraw(account, 200, "1234");
ATMTransaction deposit = atm.deposit(account, 500, "1234");
ATMTransaction balance = atm.checkBalance(account, "1234");
```

### Verification System
```java
// Verify PIN
boolean pinValid = VerificationSystem.verifyPin("ACC001", "1234", account);

// Verify transaction
boolean transactionValid = VerificationSystem.verifyTransaction(account, 1000, "STANDARD");

// Generate verification code
String code = VerificationSystem.generateVerificationCode("ACC001");
```

## Running the Application

1. Compile all Java files:
```bash
javac *.java
```

2. Run the demo:
```bash
java BankingApplicationDemo
```

## Future Enhancements

1. **Database Integration**: Add persistent storage
2. **Web Interface**: RESTful API for web/mobile access
3. **Additional Account Types**: Credit cards, loans, investments
4. **Advanced Security**: Biometric authentication, 2FA
5. **Transaction Categories**: Budget tracking and reporting
6. **Interest Calculation**: Automatic interest on savings
7. **Notification System**: SMS/Email alerts for transactions
8. **Multi-Currency Support**: International transactions

## Architecture Benefits

1. **Modular Design**: Each class has a single responsibility
2. **Security First**: Multiple layers of verification
3. **Scalable**: Easy to add new features
4. **Maintainable**: Clear separation of concerns
5. **Extensible**: Support for new transaction types
6. **Robust**: Comprehensive error handling and validation

## Testing

The system includes a comprehensive demo class (`BankingApplicationDemo.java`) that demonstrates all major functionalities including customer creation, account management, ATM operations, and verification systems.