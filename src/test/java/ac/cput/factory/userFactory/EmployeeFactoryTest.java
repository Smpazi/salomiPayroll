package ac.cput.factory.userFactory;

import ac.cput.domain.user.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    Map<String, String> values;
    @Before
    public void setUp() throws Exception {

        values = new HashMap<>();
        values.put("Name","Salomi");

    }
    @Test
    public  void getEmployee(){
        Employee employee = EmployeeFactory.getEmployee(values);
        Assert.assertEquals("Salomi",employee.getfName());
    }
}