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
}
