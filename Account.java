
package account;
import java.util.Date;


public class Account {
    
 private   int id;
  double balance;
  private  double annualInterestRate;
   private Date dateCreated;
  

    
    public Account(){
        this.id=0;
        this.balance=0;
        this.dateCreated=new Date();
        
    }

    public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        
        return this.dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / (12);
        
    }
    
    public double getMonthlyInterest(){
        return (balance) * getMonthlyInterestRate();
        
    }
    
    public double withdraw(double amount){
        
      return balance -= amount;
        
    }
    
    public double deposit(double amount){
        return balance+= amount;
        
    } 
    @Override
    public String toString(){
        
        return "id:"+ getId() + "," + "balance:" +getBalance()+ "," + "yıllık faiz oranı:" + getAnnualInterestRate();
    }
    

   
   
    
}
