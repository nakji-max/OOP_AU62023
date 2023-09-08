package bankInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return (float) accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void deposit(double money){
        if(money > 0){
        this.accountBalance +=  money;
         System.out.println("amount deposited: " + "₱" + money);
        System.out.println("after deposit: " + "₱" + accountBalance);
        }
     
    }
    public void withdraw(double money){
        if(this.accountBalance >= 0){
            this.accountBalance -= money;
            System.out.println("money withdrawn: " + "₱" + money);
            System.out.println("after withdraw: " + "₱" + accountBalance);
        } else {
            System.out.println("Insufficent funds to withdraw.");
        }
        
    }
}
