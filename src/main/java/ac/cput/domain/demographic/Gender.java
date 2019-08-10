package ac.cput.domain.demographic;

import java.util.Objects;

public class Gender {

    private String genderId, descr_gender;

    private Gender(){
    }

    private Gender(Builder builder){
        this.genderId= builder.genderId;
        this.descr_gender= builder.descr_gender;

    }

    public String getGenderId() {
        return genderId;
    }

    public static class Builder{
        private String genderId, descr_gender;

        public Builder genderId(String genderId){
            this.genderId =genderId;
            return this;
        }

        public Builder descr_gender(String descr_gender){
            this.descr_gender=descr_gender;
            return this;
        }


        public Builder copy(Gender gender){
            this.genderId = gender.genderId;
            this.descr_gender = gender.descr_gender;

            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    }

    @Override
    public String toString() {
        return "GenderFactory{" +
                "GenderId='" + genderId + '\'' +
                ", Gender='" + descr_gender + '\'' +
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
