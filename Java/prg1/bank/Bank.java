
package bank;
// /import java.lang.reflect.Array;
import java.util.ArrayList;
import bank.account.Account;

public class Bank{
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
