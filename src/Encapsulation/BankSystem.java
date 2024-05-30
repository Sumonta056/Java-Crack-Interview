package Encapsulation;

import java.time.LocalDateTime;

public class BankSystem {
    // Private Variables
    private int accountNumber;
    private String userName;
    private double balance;
    private LocalDateTime lastTransactionTime;

    // Public get methods for private variables
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDateTime getLastTransactionTime() {
        return lastTransactionTime;
    }

    // Public set methods for private variables
    public void depositAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit Amount is too low!!");
        } else {
            balance += amount;
            updateTransactionTime();
        }
    }

    public void withDrawAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw Amount is too low!!");
        } else {
            balance -= amount;
            if (balance < 0) balance = 0;
            updateTransactionTime();
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Private method to update the transaction time
    private void updateTransactionTime() {
        lastTransactionTime = LocalDateTime.now();
    }
}