/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankInfo;

/**
 *
 * @author User
 */
public class Main {
   public static void main(String[] args) {
       
        BankAccount myAccount = new BankAccount(123456789, 1000.00, "James Cheong", "jamwesatasdasda@.com", 123456);

        System.out.println("Initial Account Information:");
        displayAccountInfo(myAccount);

        myAccount.deposit((double) 500.00);
 
        myAccount.withdraw((double) 200.00); 
        
        myAccount.withdraw((float) 1000.00);

       

        System.out.println("\nUpdated Account Information:");
        displayAccountInfo(myAccount);
    }

    public static void displayAccountInfo(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Account Balance: ₱" + account.getAccountBalance());
    }
}
