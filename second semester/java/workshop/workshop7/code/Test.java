
//  Test
class Customer{
    private String Fname;
    private String Lname;
}

class Account {
    private long accountNumber;
    private double balance;
    public Account(Long accountNumber , double balance,  String Fname , String Lname){
        super(Fname ,Lname);
        this.accountNumber=accountNumber;
        this.balance=accountNumber;
    }

    public void deposite(){
        
    }
    public void withdraw(){

    }
}
class Transaction{
    protected void transfer(Account toAccount ,Account fromAccount){

    }
}

public class Test{
    public static void main(String[] args) {
        Account acc=new Account (12312,100.32,"dipesh","roshan");
        }
}