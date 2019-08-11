package ac.cput.domain.demographic;

import java.util.Objects;

public class Race {
    private String raceId, descr_race;

    private Race(){
    }

    private Race(Builder builder){
        this.raceId = builder.raceId;
        this.descr_race= builder.discr_race;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getDescr_race() {
        return descr_race;
    }

    public static class Builder{
        private String raceId, discr_race;

        public Builder raceId(String raceId){
            this.raceId =raceId;
            return this;
        }

        public Builder discr_race(String discr_race){
            this.discr_race =discr_race;
            return this;
        }

        public Builder copy(Race race){
            this.raceId = race.raceId;
            this.discr_race= race.descr_race;
            return this;
        }

        public Race build(){
            return new Race(this);
        }
    }

    @Override
    public String toString() {
        return "RaceFactory{" +
                "RaceId='" + raceId + '\'' +
                ", Race='" + descr_race + '\'' +


                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return
                raceId.equals(race.raceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId);
    }
}
