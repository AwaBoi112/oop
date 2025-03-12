package lab4_1;

public class Person {
    private final  String firstName;
    private  String lastName;
    private final int birtYear;

    public Person(String firstName,String lastName ,int birtYear) {
        this.firstName = firstName;
        this.birtYear = birtYear;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirtYear() {
        return birtYear;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtYear=" + birtYear +
                '}';
    }
}
