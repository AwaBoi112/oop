package lab3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName,String lastName){
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
    public BankAccount getAccount(){
        return account;
    }
    public void setAccount(BankAccount account){
        this.account=account;
    }
    public void closeAccount(){
        this.account=null;
    }
    public String toString(){
        return firstName+" "+lastName+" "+account;
    }


}
