package za.ac.cput.entity.demography;

public class Demography {

    private String employeeNum;
    private String genderId;
    private String raceId;

    private Demography(){}

    public Demography(Builder builder) {
        this.employeeNum = builder.employeeNum;
        this.genderId = builder.genderId;
        this.raceId = builder.raceId;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getRaceId() {
        return raceId;
    }

    @Override
    public String toString() {
        return "Demography{" +
                "employeeNum='" + employeeNum + '\'' +
                ", genderId='" + genderId + '\'' +
                ", raceId='" + raceId + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNum;
        private String genderId;
        private String raceId;

        public Builder setEmployeeNum(String employeeNum) {
            this.employeeNum = employeeNum;
            return this;
        }

        public Builder setGenderId(String genderId) {
            this.genderId = genderId;
            return this;
        }

        public Builder setRaceId(String raceId) {
            this.raceId = raceId;
            return this;
        }
        public Builder copy(Demography demography){
            this.employeeNum = demography.employeeNum;
            this.genderId = demography.genderId;
            this.raceId = demography.raceId;
            return this;
        }
        public Demography build(){
            return new Demography(this);
        }
    }
}
