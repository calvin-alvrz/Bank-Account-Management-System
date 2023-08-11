import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your \'Name\'' and \'Customer ID\'' to access your bank account");
        System.out.println("Name:");
        String name = keyboard.nextLine();
        System.out.println("Customer ID (e.g. 123123)");
        String customerId = keyboard.nextLine();
        BankAccount obj1 = new BankAccount(name, customerId);
        obj1.menu();
        keyboard.close();
    }
}