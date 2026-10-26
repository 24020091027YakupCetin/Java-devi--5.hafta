
package account;

import java.util.Date;


public class Savings extends Account {

     public Savings(int id,double balance,double annualInterestRate, Date dateCreated) {
        
        super(id,balance,annualInterestRate,dateCreated);
        
    }

    
   @Override
   public double withdraw(double amount){
       
       if(amount >= getBalance()){
           
           setBalance(getBalance()-amount);
           
           
        return getBalance();
           
       }
       else{
           return balance-=amount;
       }
        
      
        
    }
   
   @Override
    public String toString(){
        
        return "id:"+ getId() + "," + "balance:" +getBalance()+ ","+"tarih:"+getDateCreated();
    }
    
    
}
