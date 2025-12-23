package classes_and_objects.basic;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("000000", "Default Name", "Default Email ", "Default Phone", BigDecimal.ZERO);

    }
    public BankAccount(String accountNumber, String customerName, String email, String phoneNumber, BigDecimal initialBalance) {
        System.out.println("Parameterized constructor called");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = initialBalance;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", customerName, email, phoneNumber, BigDecimal.ZERO);
        System.out.println("Partial parameterized constructor called");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount);
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(balance) <= 0) {
            balance = balance.subtract(amount);
            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
