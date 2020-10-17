/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author ACER
 */
public class BankTest {
    public static void main(String[] args) {
        CheckAccount c=new CheckAccount(101);
        System.out.println("Depoditing: ");
        c.deposit(500.00);
        try {
            System.out.println("Withdrawing 500");
            c.withdraw(100.00);
            System.out.println("Withdrawing 600");
            c.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $"+e.getAmount());
            
        }
    }
}
