import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("        Welcome to Banking System");
        System.out.println("-----------------------------------------\n");
        System.out.println("Please enter your name:");
        String name = keyboard.nextLine();

        while (true) {
            System.out.println("Customer ID:");
            String customerId = keyboard.nextLine();

            if (customerId.length() == 6) {
                BankAccount obj1 = new BankAccount(name, customerId);
                obj1.menu();
                break;
            }
            else {
                System.out.println("\nPlease enter a correct ID number with 6 digits(e.g. #000000).\n");
            }
        }

        keyboard.close();
    }
}