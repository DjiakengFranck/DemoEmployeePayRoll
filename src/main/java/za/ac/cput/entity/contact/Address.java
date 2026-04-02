package za.ac.cput.entity.contact;

import za.ac.cput.entity.identity.Employee;

public class Address {
    private Employee employee;
    private String streetAddress;
    private String postalAddress;
    private String email;

    public Address(Builder builder) {
        this.employee = builder.employee;
        this.streetAddress = builder.streetAddress;;
        this.postalAddress = builder.postalAddress;
        this.email = builder.email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "employee=" + employee +
                ", streetAddress='" + streetAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private Employee employee;
        private String streetAddress;
        private String postalAddress;
        private String email;

        public Builder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public Builder setStreetAddress(String streetAddress){
            this.streetAddress = streetAddress;
            return this;
        }
        public Builder setPostalAddress(String postalAddress){
            this.postalAddress = postalAddress;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder copy(Address address){
            this.employee = address.employee;
            this.streetAddress = address.streetAddress;
            this.postalAddress = address.postalAddress;
            this.email = address.email;
            return this;
        }

        public Address build(){
            return new Address(this);
        }

    }
}
