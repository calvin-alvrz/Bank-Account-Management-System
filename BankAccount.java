public class BankAccount {
    
    private double balance;
    private double prevTrans;
    private String customerName;
    private String customerId;

    BankAccount(String customerName,String customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }
}
