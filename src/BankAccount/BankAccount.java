/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

/**
 *
 * @author c3
 */
public class BankAccount {
    private static double balance;
    private static int accountNumber;
    
    public BankAccount(double b,int a) {
        balance=b;
        accountNumber=a;
    }
    
    public static double getBalnce(){
        return balance;
    }
    
    public static int getAccount(){
        return accountNumber;
    }
    
    public static void deposit(double d){
        balance+=d;
    }
    
    public static void withdraw(double w){
        balance-=w;
    }    
}
