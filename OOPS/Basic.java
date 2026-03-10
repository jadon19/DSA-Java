package OOPS;
class Account{
    String name;
    double balance;

    public void deposit(int amt){
        balance += amt;
        System.out.println("New balance "+balance);
    }
    public void withdraw(int amt){
        if (amt>balance){
            System.out.println("Not enough balance");
            return;
        }
        balance-=amt;
        System.out.println("New balance "+balance);
    }

}
public class Basic{
    public static void main(String[] args) {
        Account myAccount = new Account();
        
        myAccount.name = "tanishka";
        myAccount.balance = 10000;
        System.out.println(myAccount.name);
        myAccount.deposit(3000);
        myAccount.withdraw(4000);


        // this is  a new object and it has its own variables:
        Account newAccount = new Account();
        System.out.println(newAccount.name);

    }
}