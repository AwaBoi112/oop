package lab3_1;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("John", "BLACK");
        Customer customer2= new Customer("Mary","WHITE");
        customer1.setAccount(new BankAccount("OTP112"));
        customer1.getAccount().deposit(100);
        System.out.println(customer1);
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer2);
        customer2.setLastName(customer1.getLastName());
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);
        System.out.println(customer1);


    }
}
