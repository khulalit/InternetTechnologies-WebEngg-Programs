
package account;
public class Account {
    // instance variable
    private String name;
    private int accountNumber ;
    private float balance;
    
    //method to return account info includng name , account number, balance
    public String accountInfoFull(){
        return "Name: "+this.name+"\nAccount No. : "+this.accountNumber+"\nBalance: "+this.balance;
    }
    public Account(String n, int acctNum, float initialBalance)
    {
        name = n;
        accountNumber = acctNum;
        balance = initialBalance;
    }
    public float deposit(float amount)	
    {
        float newBalance = balance + amount;
        balance = newBalance;
        return balance;						
    }
    public float withdraw(float amount){
        float newBalance = balance - amount;
        balance = newBalance;
        return balance;						
    }
    public int getAccountInfo(){
        return accountNumber;
    }
    public float getBalance(){
        return balance;
    }

}