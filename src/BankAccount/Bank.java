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
    
    private static ArrayList<BankAccount> ba;
    
    public Bank (){
        ba=new ArrayList<BankAccount>();
    }
    
    public static void addAccount(double b,int a){
        BankAccount ab=new BankAccount(b,a);
        ba.add(ab);
    }
    
    public static double getTotal(){
        double total=0;
        
        for(int i=0;i<ba.size();i++)
           total+=ba.get(i).getBalnce();
        
        return total;
        
    }
    
    public static int  getMin(){
        double min=ba.get(0).getBalnce();
        int ac=ba.get(0).getAccount();
        
        for(int i=1;i<ba.size();i++){
            if(min>ba.get(i).getBalnce()){
                min=ba.get(i).getBalnce();
                ac=ba.get(i).getAccount();
            }
        }
        return ac;
    }
    
    public static int  getMax(){
        double max=ba.get(0).getBalnce();
        int ac=ba.get(0).getAccount();
        
        for(int i=1;i<ba.size();i++){
            if(max<ba.get(i).getBalnce()){
                max=ba.get(i).getBalnce();
                ac=ba.get(i).getAccount();
            }
        }
        return ac;
    }

    public static double getInfo(int a){
        

        for(int i=0;i<ba.size();i++){
            if(a==ba.get(i).getAccount())
                return ba.get(i).getBalnce();
        }
        return 0;
        
    }
    
    public static int count(){
        int c=0;
        
        for(int i=0;i<ba.size();i++){
            if(ba.get(i).getBalnce()>=2000)
                c++;
                
        }
        return c;
    }
}
