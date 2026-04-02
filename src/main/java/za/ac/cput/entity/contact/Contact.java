package za.ac.cput.entity.contact;

import za.ac.cput.entity.identity.Employee;

public class Contact {
    private Employee employee;
    private String cellNumber;
    private String homeNumber;
    private String email;

    public Contact(Builder builder) {
        this.employee = builder.employee;
        this.cellNumber = builder.cellNumber;
        this.homeNumber = builder.homeNumber;
        this.email = builder.email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getCellNumber() {
        return cellNumber;
    }
    public String getHomeNumber() {
        return homeNumber;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "employee=" + employee +
                ", cellNumber='" + cellNumber + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private Employee employee;
        private String cellNumber;
        private String homeNumber;
        private String email;

        public Builder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder setHomeNumber(String homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder copy(Contact contact){
            this.employee = contact.employee;
            this.cellNumber = contact.cellNumber;
            this.homeNumber = contact.homeNumber;
            this.email = contact.email;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }
}
