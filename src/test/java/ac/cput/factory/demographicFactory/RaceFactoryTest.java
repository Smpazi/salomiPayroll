package ac.cput.factory.demographicFactory;

import ac.cput.domain.demographic.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RaceFactoryTest {
    Map<String, String> values;
    @Before
    public void setUp() throws Exception {

        values = new HashMap<>();
        values.put("RaceId","2");

    }
    @Test
    public  void getGender(){
        Race race = RaceFactory.getRace(values);
        Assert.assertEquals("2",race.getRaceId());
    }

}