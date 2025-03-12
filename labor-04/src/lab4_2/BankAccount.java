package lab4_2;

public class BankAccount {
    //atributumok
    private String accountNumber;
    private double balance;
    //consturctor
    public BankAccount(String number) {
        accountNumber = number;
        balance = 0;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double balancein) {
        if(balancein >= 0){
            balance += balancein;
        }
        else{
            System.out.println();
        }
    }
    public void withdraw(double x){
        if(balance >= x){
            balance -= x;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public String toString(){
        return accountNumber+" "+balance;
    }
}
