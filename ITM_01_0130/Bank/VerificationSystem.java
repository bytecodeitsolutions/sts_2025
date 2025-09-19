import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class VerificationSystem {
    private static Map<String, String> verificationCodes = new HashMap<>();
    private static Map<String, Integer> failedAttempts = new HashMap<>();
    private static final int MAX_FAILED_ATTEMPTS = 3;
    
    public static boolean verifyTransaction(Account account, double amount, String verificationMethod) {
        // Different verification methods based on transaction amount
        if (amount <= 100) {
            return verifyBasicTransaction(account);
        } else if (amount <= 1000) {
            return verifyStandardTransaction(account);
        } else {
            return verifyHighValueTransaction(account, amount);
        }
    }
    
    private static boolean verifyBasicTransaction(Account account) {
        // Basic verification - just check account status
        return account.isActive();
    }
    
    private static boolean verifyStandardTransaction(Account account) {
        // Standard verification - check account and basic security
        return account.isActive();
    }
    
    private static boolean verifyHighValueTransaction(Account account, double amount) {
        // High-value verification - additional security checks
        if (!account.isActive()) {
            return false;
        }
        
        // Check if amount exceeds daily limit (example: $5000)
        double dailyLimit = 5000.0;
        if (amount > dailyLimit) {
            System.out.println("Transaction requires additional approval - exceeds daily limit");
            return false;
        }
        
        return true;
    }
    
    public static String generateVerificationCode(String accountNumber) {
        String code = generateRandomCode(6);
        verificationCodes.put(accountNumber, code);
        return code;
    }
    
    public static boolean verifyCode(String accountNumber, String inputCode) {
        String storedCode = verificationCodes.get(accountNumber);
        if (storedCode != null && storedCode.equals(inputCode)) {
            verificationCodes.remove(accountNumber);
            return true;
        }
        
        // Track failed attempts
        int attempts = failedAttempts.getOrDefault(accountNumber, 0);
        failedAttempts.put(accountNumber, attempts + 1);
        
        if (attempts + 1 >= MAX_FAILED_ATTEMPTS) {
            System.out.println("Account temporarily locked due to multiple failed verification attempts");
        }
        
        return false;
    }
    
    public static boolean verifyPin(String accountNumber, String inputPin, Account account) {
        int attempts = failedAttempts.getOrDefault(accountNumber, 0);
        
        if (attempts >= MAX_FAILED_ATTEMPTS) {
            System.out.println("Card blocked due to too many failed PIN attempts");
            return false;
        }
        
        if (account.verifyPin(inputPin)) {
            failedAttempts.remove(accountNumber);
            return true;
        } else {
            failedAttempts.put(accountNumber, attempts + 1);
            return false;
        }
    }
    
    private static String generateRandomCode(int length) {
        String chars = "0123456789";
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            code.append(chars.charAt(random.nextInt(chars.length())));
        }
        
        return code.toString();
    }
    
    public static String hashPin(String pin) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(pin.getBytes());
            StringBuilder hexString = new StringBuilder();
            
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            return pin; // Fallback - should not happen
        }
    }
    
    public static void resetFailedAttempts(String accountNumber) {
        failedAttempts.remove(accountNumber);
    }
    
    public static boolean isAccountLocked(String accountNumber) {
        return failedAttempts.getOrDefault(accountNumber, 0) >= MAX_FAILED_ATTEMPTS;
    }
}