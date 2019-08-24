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
    private double balance;
    private int acc_no;
    
    public BankAccount(int a,double b) {
        acc_no=a;
        balance=b;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public int getAccount(){
        return acc_no;
    }
    
    public void deposit(double d){
        balance+=d;
    }
    
    public void withdraw(double w){
        balance-=w;
    }    
}
