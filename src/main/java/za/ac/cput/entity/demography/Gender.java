package za.ac.cput.entity.demography;

public class Gender {
    private String genderId;
    private String genderDesc;

    public Gender(Builder builder) {
        this.genderId = builder.genderId;
        this.genderDesc = builder.genderDesc;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getGenderDesc() {
        return genderDesc;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", genderDesc='" + genderDesc + '\'' +
                '}';
    }

    public static class Builder{
        private String genderId;
        private String genderDesc;

        public Builder setGenderId(String genderId) {
            this.genderId = genderId;
            return this;
        }

        public Builder setGenderDesc(String genderDesc) {
            this.genderDesc = genderDesc;
            return this;
        }
        public Builder copy(Gender gender){
            this.genderId = gender.genderId;
            this.genderDesc = gender.genderDesc;
            return this;
        }
        public Gender build(){
            return new Gender(this);
        }
    }
}
