package za.ac.cput.entity.identity;

public abstract class Employee {

    protected String empNumber;
    protected String firstName;
    protected String lastName;
    protected String nationality;

    @Override
    public abstract String toString();

    public String getEmpNumber() {
        return empNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

}
