package ac.cput.factory.demographicFactory;

import ac.cput.domain.demographic.Race;

import java.util.Map;

public class RaceFactory {
    public static Race getRace(Map<String,String> values)
    {
        return new Race.Builder()
                .raceId(values.get("RaceId"))
                .discr_race(values.get("Race"))
                .build();

    }
}
