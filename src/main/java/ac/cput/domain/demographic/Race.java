package ac.cput.domain.demographic;

import java.util.Objects;

public class Race {
    private String raceId, black,white,other;

    private Race(){
    }

    private Race(Builder builder){

    }

    public String getRaceId() {
        return raceId;
    }

    public String getBlack() {
        return black;
    }

    public String getWhite() {
        return white;
    }

    public String getOther() {
        return other;
    }


    public static class Builder{
        private String raceId, black,white,other;

        public Builder raceId(String raceId){
            this.raceId =raceId;
            return this;
        }

        public Builder black(String black){
            this.black =black;
            return this;
        }

        public  Builder white(String white){
            this.white= white;
            return this;
        }
        public  Builder other(String other){
            this.other= other;
            return this;
        }

        public Builder copy(Race race){
            this.raceId = race.raceId;
            this.black = race.black;
            this.white = race.white;
            this.other= race.other;

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
                ", Black='" + black + '\'' +
                ", White='" + white + '\'' +
                ", Other='" + other + '\'' +

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
