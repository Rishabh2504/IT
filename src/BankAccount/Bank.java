/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

import java.util.ArrayList;

/**
 *
 * @author c3
 */
public class Bank {
    
    static ArrayList<BankAccount> ba;
    
    public Bank (){
        ba=new ArrayList<>();
    }
    
    public static void addAccount(int acc,double bal){
        BankAccount ab=new BankAccount(acc,bal);
        ba.add(ab);
    }
    
    public static double getTotal(){
        double total=0;
        
        for(int i=0;i<ba.size();i++)
           total+=ba.get(i).getBalance();
        
        return total;
        
    }
    
    public static int  getMin(){
        double min=ba.get(0).getBalance();
        int ac=ba.get(0).getAccount();

        for(int i=1;i<ba.size();i++){
            if(min>ba.get(i).getBalance()){
                min=ba.get(i).getBalance();
                ac=ba.get(i).getAccount();
            }
        }
        return ac;
    }
    
    public static int  getMax(){
        double max=ba.get(0).getBalance();
        int ac=ba.get(0).getAccount();
        
        for(int i=1;i<ba.size();i++){
            if(max<ba.get(i).getBalance()){
                max=ba.get(i).getBalance();
                ac=ba.get(i).getAccount();
            }
        }
        return ac;
    }

    public static double getInfo(int a){
        

        for(int i=0;i<ba.size();i++){
            if(a==ba.get(i).getAccount())
                return ba.get(i).getBalance();
        }
        return 0;
        
    }
    
    public static int count(){
        int c=0;
        
        for(int i=0;i<ba.size();i++){
            if(ba.get(i).getBalance()>=2000)
                c++;
                
        }
        return c;
    }
}
