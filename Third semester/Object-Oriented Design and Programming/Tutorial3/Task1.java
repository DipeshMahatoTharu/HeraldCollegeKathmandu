/*Create a class BankAccount with private fields accountNumber and balance.
Implement getter and setter methods to control access to these fields.
Write a method to deposit and withdraw money from the account, ensuring that negative balances aren't allowed.
*/ 
class BankAccount{
    private String accountNumber;
    private double balance;
    
 public BankAccount(String accountNumber , double balance){
    this.accountNumber = accountNumber;
    this.balance=Math.max(balance, 0.0);
 }

 public String getAccountNumber(){
    return accountNumber;
 }

 public void setAccountNumber(String accountNumber) {
     this.accountNumber = accountNumber;
 } 

 public double getbalance(){
    return balance;
 }

 public void setgetbalance(double balance ){
    this.balance=balance;
 }

        public void deposit(double amount ){
           if(amount > 0){
            balance+=amount;
           }
         
        }

        public void withdraw( double amount){
           if(amount > 0 && balance >=amount ){
            balance-= amount;
           }
        
        }

}

public class Task1{

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("asdasdasd311313299239923", 5666);
        bankAccount.deposit(200);
        bankAccount.withdraw(5000);

        System.out.println("Account number : "+  bankAccount.getAccountNumber());
        System.out.println("balance : "+  bankAccount.getbalance());
        
    }
}