
import java.util.Scanner;
import java.util.ArrayList;
//====================================================================
class Account {
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
//=================================================================




// /import java.lang.reflect.Array;


class Bank{
    // creating arraylist to store account objects 

    ArrayList<Account> accounts = new ArrayList<>(); 

    // dependency function to find max number of the array
    private int largest(float arr[]) 
     { 
         int i; 
         int maxIndex = 0;  
         // Initialize maximum element 
         float max = arr[0]; 
        
         // Traverse array elements from second and 
         // compare every element with current max   
         for (i = 1; i < arr.length; i++) 
             if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
             }
                  
        
         return maxIndex; 
     }  

     // dependency function to find max number of the array
     private int smallest(float arr[]) 
     { 
         int i; 
         int minIndex = 0;  
         // Initialize maximum element 
         float min = arr[0]; 
        
         // Traverse array elements from second and 
         // compare every element with current max   
         for (i = 1; i < arr.length; i++) {
             if (arr[i] < min) 
                {
                    min = arr[i]; 
                    minIndex = i;
                }
         }

         return minIndex; 
     }  
    // add account method
    public void addAccount(String name, int accountNumber, float initailBalance){
        accounts.add(new Account(name,accountNumber, initailBalance));
        System.out.println(name+", your account is added with A/C number "+accountNumber);
    }

    //get total balance method
    public float getTotalBalance(){
        float total = 0;
        for (int i = 0; i < accounts.size(); i++) {
            total = total + accounts.get(i).getBalance();
        }
        return total;
    }

    //get minimum balance account number
    public int minBalanceAccount(){
        // declaring some variable
        float[] array = new float[accounts.size()];
        for (int i = 0; i < accounts.size(); i++) {
            array[i] = accounts.get(i).getBalance();
        }
        
        return accounts.get(this.smallest(array)).getAccountInfo();
    }

    //get maximum balance account number
    public int maxBalanceAccount(){
        // declaring some variable
        float[] array = new float[accounts.size()];
        for (int i = 0; i < accounts.size(); i++) {
            array[i] = accounts.get(i).getBalance();
        }
        
        return accounts.get(this.largest(array)).getAccountInfo();
    }
    public String accountDetailByNumber(int accno){
        for(Account a: accounts){
            if(a.getAccountInfo() == accno){
                return a.accountInfoFull();
            }
        }
        return "No account found with this A/c No.";
    }
    public int specificBalanceAccount(float ammount){
        int count = 0;
        for(Account a: accounts){
            if(a.getBalance() >= ammount){
                count++;
            }
        }
        return count;
    }
    public String depositWithAccountNumbser(int accountNumber, float ammount){
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getAccountInfo()==accountNumber){
                accounts.get(i).deposit(ammount);
                return "Deposit done";
            }
        }
        return "Deposit Faild";
    }
    public String withdrawWithAccountNumbser(int accountNumber, float ammount){
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getAccountInfo()==accountNumber){
                accounts.get(i).withdraw(ammount);
                return "withdraw done";
            }
        }
        return "withdraw Faild";
    }
}


//=================================================================
public class Main {
    public static int randomNumberGen(){
       return (int) (Math.random() * (999 - 100 + 1) + 100);
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in); 
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        Scanner scanner6 = new Scanner(System.in);
        Scanner scanner7 = new Scanner(System.in);

        Bank bank = new Bank();
        // bank.addAccount("lalit", 123, 1000);
        // bank.addAccount("John Doe", randomNumberGen(), 10000);
        // System.out.println(bank.accountDetailByNumber(123));
        int option;
        boolean run = true;
        while(run){
            System.out.println("1.Add your account\n2.Get Total balance in Bank\n3.Get account number with max. and min. balance\n4.Find an account given a bank account no.\n5.Count no. of accounts having atleast specific balance\n6.Exit program");
            System.out.println("7. Deposit money ");
            option = scanner1.nextInt();
            switch (option) {
                case  1:
                    System.out.println("Enter your name");
                    String name = scanner2.nextLine();
                    System.out.println("Enter initial balance");
                    
                    float inibal = scanner3.nextFloat();
                    bank.addAccount(name, randomNumberGen(), inibal);
                    break;

                case 2 :
                    System.out.println(bank.getTotalBalance());
                    break;
                case 3 : 
                    System.out.println("Account with max balance "+bank.maxBalanceAccount()+"\nAccount with min balance "+bank.minBalanceAccount());
                    break;
                case 4 :
                    System.out.println("Enter the account number");
                    int acc = scanner4.nextInt();
                    System.out.println(bank.accountDetailByNumber(acc));
                    break;
                case 5: 
                    System.out.println("Enter specific ammount");
                    float amm = scanner5.nextFloat();
                    System.out.println(bank.specificBalanceAccount(amm));
                    break;
                case 6:
                    run = false;
                    break;
                case 7: 
                    System.out.println("Enter the account number");
                    int ano = scanner6.nextInt();
                    System.out.println("Enter the ammount");
                    float a = scanner7.nextFloat();
                    System.out.println(bank.depositWithAccountNumbser(ano, a));
                    break;
                default:
                    break;
            }
        }
    }
}



