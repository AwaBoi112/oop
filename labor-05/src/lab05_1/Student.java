package lab05_1;

public class Student {
    private final String ID;
    private final String firstName;
    private final String lastName;

    public Student(String ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return ID+" "+firstName+" "+lastName;
    }
}
