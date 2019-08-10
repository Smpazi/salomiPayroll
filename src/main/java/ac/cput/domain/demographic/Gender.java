package ac.cput.domain.demographic;

import java.util.Objects;

public class Gender {

    private String genderId, female, male;

    private Gender(){
    }

    private Gender(Builder builder){
        this.genderId= builder.genderId;
        this.female = builder.female;
        this.male= builder.male;
    }

    public String getFemale() {
        return female;
    }

    public String getMale() {
        return male;
    }

    public static class Builder{
        private String genderId, female, male;

        public Builder genderId(String genderId){
            this.genderId =genderId;
            return this;
        }

        public Builder female(String female){
            this.female =female;
            return this;
        }

        public  Builder male(String male){
            this.male= male;
            return this;
        }

        public Builder copy(Gender gender){
            this.genderId = gender.genderId;
            this.female = gender.female;
            this.male = gender.male;

            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    }

    @Override
    public String toString() {
        return "GenderFactory{" +
                "genderId='" + genderId + '\'' +
                ", Female='" + female + '\'' +
                ", Male='" + male + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return
        genderId.equals(gender.genderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genderId);
    }
}
