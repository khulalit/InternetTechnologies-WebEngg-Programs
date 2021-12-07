import java.util.*;
import bank.Bank;
public class Main2 {
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