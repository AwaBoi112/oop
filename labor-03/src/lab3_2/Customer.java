package lab3_2;

import lab3_1.BankAccount;

public class Customer {
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.numAccounts=0;
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
        return numAccounts;
    }
    public void addAccount( BankAccount account){
        if(numAccounts<MAX_ACCOUNTS){
            accounts[numAccounts]=account;
            numAccounts++;}
        else
            System.out.println("Meghaladta a maximalis accountok szamat");
    }
    public BankAccount getAccount(String accountNumber){
        for(int i=0;i<numAccounts;i++){
            if(accounts[i].getAccountNumber().equals(accountNumber))
                return accounts[i];
        }
        return null;
    }
    public void closeAccount(String accountNumber){
        int ok=0;
        for(int i=0;i< numAccounts;i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                ok=1;
                for(int j=i;j<numAccounts-1;j++){
                    accounts[j]=accounts[j+1];
                }
                accounts[numAccounts-1]=null;
                numAccounts--;
            }
        }
        if(ok==0);
        System.out.println("Nem talalhato a megadott bankaccount");

    }


    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i] +"\n");
        }
        return result.toString();
    }



}
