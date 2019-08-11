package ac.cput.factory.demographicFactory;

import ac.cput.domain.demographic.Gender;

import java.util.Map;

public class GenderFactory {

    public static Gender getGender(Map<String,String> values)
    {
        return new Gender.Builder()
                .genderId(values.get("GenderId"))
                .descr_gender(values.get("Gender"))
                .build();

    }

}
