package ac.cput.factory.demographicFactory;

import ac.cput.domain.demographic.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GenderFactoryTest {

    Map<String, String> values;
    @Before
    public void setUp() throws Exception {

        values = new HashMap<>();
        values.put("GenderId","3");

    }
    @Test
    public  void getGender(){
        Gender gender = GenderFactory.getGender(values);
        Assert.assertEquals("3",gender.getGenderId());
    }

}