package ac.cput.factory.userFactory;

import ac.cput.domain.user.EmployeeGender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeGenderFactoryTest {

    Map<String, String> values;
    @Before
    public void setUp() throws Exception {

        values = new HashMap<>();
        values.put("EmployeeId","Di44");

    }
    @Test
    public  void getEmployee(){
        EmployeeGender employeeG = EmployeeGenderFactory.getEmployeeGender(values);
        Assert.assertEquals("Di44",employeeG.getEmployeeId());
    }
}