package lab3_2;
import lab3_1.BankAccount;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Creating customers
        Customer customer1 = new Customer("John", "Black");
        Customer customer2 = new Customer("Alice", "White");

        // Adding 5 accounts to customer1
        for (int i = 1; i <= 5; i++) {
            customer1.addAccount(new BankAccount("C1-ACC" + i));
        }

        // Adding 9 accounts to customer2
        for (int i = 1; i <= 9; i++) {
            customer2.addAccount(new BankAccount("C2-ACC" + i));
        }

        // Printing customers
        System.out.println("Customers before deposits:");
        System.out.println(customer1);
        System.out.println(customer2);

        // Depositing random amounts
        Random random = new Random();
        for (int i = 0; i < customer1.getNumAccounts(); i++) {
            customer1.getAccount("C1-ACC" + (i + 1)).deposit(random.nextInt(1000) + 1);
        }
        for (int i = 0; i < customer2.getNumAccounts(); i++) {
            customer2.getAccount("C2-ACC" + (i + 1)).deposit(random.nextInt(1000) + 1);
        }

        // Closing first account of customer1
        customer1.closeAccount("C1-ACC1");

        // Closing last account of customer2
        customer2.closeAccount("C2-ACC9");

        // Printing customers after closing accounts
        System.out.println("Customers after closing accounts:");
        System.out.println(customer1);
        System.out.println(customer2);

    }
}
