package lab4_2;

import lab4_2.BankAccount;

import java.util.ArrayList;

public class Customer {
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String x){
        lastName=x;
    }
    public int getNumAccounts(){
        return accounts.size();
    }
    public void addAccount( BankAccount account){
        accounts.add(account);
    }
    public BankAccount getAccount(String accountNumber){
        for(BankAccount i:accounts){
            if(i.getAccountNumber().equals(accountNumber)){
                return i;
            }
        }
    return null;

    }
    public void closeAccount(String accountNumber){
        int ok=0,k=0;
        for(BankAccount i:accounts){
            if(i.getAccountNumber().equals(accountNumber)){
                ok++;
                accounts.remove(k);
                break;
            }
            k++;
        }
        if(ok==0)
        System.out.println("Nem talalhato a megadott bankaccount");

    }

    @Override
    public String toString() {
        return "Customer{" +
                "accounts=" + accounts +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
