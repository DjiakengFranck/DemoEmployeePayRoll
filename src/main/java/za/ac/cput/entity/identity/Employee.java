package za.ac.cput.entity.identity;

public class Employee {

    private String empNumber;
    private String firstName;
    private String lastName;
    private String nationality;

    private Employee() {}

    private Employee(Builder builder) {
        this.empNumber = builder.empNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nationality = builder.nationality;
    }

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

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber='" + empNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static class Builder{

        private String empNumber;
        private String firstName;
        private String lastName;
        private String nationality;


        public Builder setEmpNumber(String empNumber) {
            this.empNumber = empNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder copy(Employee employee){
            this.empNumber = employee.empNumber;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.nationality = employee.nationality;
            return this; 

        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
