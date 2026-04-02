package za.ac.cput.entity.employment;

public class Employment {
    private String employmentID;
    // private Enum employmentType(Contract, Permanent)


    public Employment(Builder builder) {
        this.employmentID = builder.employmentID;
    }

    public String getEmploymentID() {
        return employmentID;
    }

    @Override
    public String toString() {
        return "Employment{" +
                "employmentID='" + employmentID + '\'' +
                '}';
    }

    public static class Builder{
        private String employmentID;

        public Builder setEmploymentID(String employmentID) {
            this.employmentID = employmentID;
            return this;
        }
        public Builder copy(Employment employment){
            this.employmentID = employment.employmentID;
            return this;
        }

        public Employment build(){
            return new Employment(this);
        }
    }
}
