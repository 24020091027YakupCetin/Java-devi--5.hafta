
package account;



import java.util.Date;


public class Checking extends Account {
    
    private double overdraftLimit;


    public Checking(double overdraftLimit,int id,double balance,double annualInterestRate, Date dateCreated) {
        
        super(id,balance,annualInterestRate,dateCreated);
        this.overdraftLimit = overdraftLimit;
    }
    

 
    @Override
    public double withdraw(double amount){
       
       
      if (balance - amount >= -overdraftLimit) {
    balance -= amount;
    return balance;
}
      else {
    System.out.println("Limit aşıldı!");
    return balance;
}
        
      
        
    }
    
    @Override
    public String toString(){
        
        return "id:"+ getId() + "," + "balance:" +getBalance()+ ","+"tarih:"+getDateCreated()+","+"overdraft limiti:"+ overdraftLimit ;
    }
    
    

    
    
    
}
