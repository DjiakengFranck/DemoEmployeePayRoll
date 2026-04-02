package za.ac.cput.entity.demography;

public class Race {
    private String raceId;
    private String raceDesc;

    public Race(Builder builder) {
        this.raceId = builder.raceId;
        this.raceDesc = builder.raceDesc;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getRaceDesc() {
        return raceDesc;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId='" + raceId + '\'' +
                ", raceDesc='" + raceDesc + '\'' +
                '}';
    }

    public static class Builder{
        private String raceId;
        private String raceDesc;

        public Builder setRaceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public Builder setRaceDesc(String raceDesc) {
            this.raceDesc = raceDesc;
            return this;
        }
        public Builder copy(Race race){
            this.raceId = race.raceId;
            this.raceDesc = race.raceDesc;
            return this;
        }
        public Race build(){
            return new Race(this);
        }
    }
}
