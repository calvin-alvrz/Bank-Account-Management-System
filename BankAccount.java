import java.util.Scanner;

public class BankAccount {
    
    private double balance;
    private double prevTrans;
    private String customerName;
    private String customerId;

    BankAccount(String customerName,String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(double amount) {
        if (amount != 0){
            balance += amount;
            prevTrans = amount;
        }
    }

    void withdraw(double amt) {
        if (amt != 0 && balance >= amt){
            balance -= amt;
            prevTrans =- amt;
        }
        else if (balance < amt){
            System.out.println("Bank balance insufficient");
        }
    }

    void getPreviousTrans() {
        if (prevTrans > 0){
            System.out.println("Deposited: "+prevTrans);
        }
        else if (prevTrans < 0){
            System.out.println("Withdrawn: "+Math.abs(prevTrans));
        }
        else {
            System.out.println("No transaction occured");
        }
    }

    void menu() {
        char option;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID:" + customerId);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");

        do{
            System.out.println("********************************************");
            System.out.println("Choose an option");
            option = keyboard.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'a':
                    System.out.println("......................");
                    System.out.println("Balance =" + balance);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("......................");
                    System.out.println("Enter a amount to deposit :");
                    System.out.println("......................");
                    double amt = keyboard.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.println("Enter a amount to Withdraw :");
                    System.out.println("......................");
                    double amtW=keyboard.nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Previous Transaction:");
                    getPreviousTrans();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'e':
                    System.out.println("......................");
                    break;
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }

        }while(option!='e');

        System.out.println("Thank you for using our banking services");
        keyboard.close();
    }
}
