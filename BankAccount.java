public class BankAccount {
    
    private double balance;
    private double prevTrans;
    private String customerName;
    private String customerId;

    BankAccount(String customerName,String customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(double amount){
        if(amount != 0){
            balance += amount;
            prevTrans = amount;
        }
    }

    void withdraw(double amt){
        if(amt != 0 && balance >= amt){
            balance -= amt;
            prevTrans =- amt;
        }
        else if(balance < amt){
            System.out.println("Bank balance insufficient");
        }
    }
}
