package za.ac.cput.entity.identity;

public class Identity extends Employee {

    private String identityType;
    private String description;

    public Identity(Builder builder) {
        this.empNumber = builder.empNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nationality = builder.nationality;
        this.identityType = builder.identityType;
        this.description = builder.description;
    }

    public String getIdentityType() {
        return identityType;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "empNumber='" + empNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", identityType='" + identityType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{

        private String empNumber;
        private String firstName;
        private String lastName;
        private String nationality;
        private String identityType;
        private String description;

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

        public Builder setIdentityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Identity identity){
            this.empNumber = identity.empNumber;
            this.firstName = identity.firstName;
            this.lastName = identity.lastName;
            this.nationality = identity.nationality;
            this.identityType = identity.identityType;
            this.description = identity.description;
            return this;
        }

        public Identity build(){
            return new Identity(this);
        }
    }
}
