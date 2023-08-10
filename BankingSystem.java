import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your \'Name\'' and \'Customer ID\'' to access your bank account");
        String name = keyboard.nextLine();
        String customerId = keyboard.nextLine();
        BankAccount obj1 = new BankAccount(name, customerId);
        obj1.menu();
        keyboard.close();
    }
}