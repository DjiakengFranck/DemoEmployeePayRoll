package za.ac.cput.entity.employment;

import za.ac.cput.entity.identity.Employee;

public class Position extends Employee {

    private String positionCode;
    //public enum status (OPEN, CLOSE);
    private Job jobDetails;


    public Position(Builder builder) {
        this.empNumber = builder.empNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nationality = builder.nationality;
        this.positionCode = builder.positionCode;
        this.jobDetails = builder.jobDetails;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public Job getJob() {
        return jobDetails;
    }

    @Override
    public String toString() {
        return "Position{" +
                "empNumber='" + empNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", positionCode='" + positionCode + '\'' +
                ", jobDetails=" + jobDetails +
                '}';
    }

    public static class Builder{
        private String empNumber;
        private String firstName;
        private String lastName;
        private String nationality;
        private String positionCode;
        private Job jobDetails;

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

        public Builder setPositionCode(String positionCode) {
            this.positionCode = positionCode;
            return this;
        }

        public Builder setJobDetails(Job jobDetails) {
            this.jobDetails = jobDetails;
            return this;
        }

        public Builder copy(Position position){
            this.empNumber = position.empNumber;
            this.firstName = position.firstName;
            this.lastName = position.lastName;
            this.nationality = position.nationality;
            this.positionCode = position.positionCode;
            this.jobDetails = position.jobDetails;
            return this;
        }

        public Position build(){
            return new Position(this);
        }
    }
}
