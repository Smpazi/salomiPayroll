package ac.cput.factory.userFactory;

import ac.cput.domain.user.EmployeeRace;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class EmployeeRaceFactoryTest {


    @Test
    public  void getEmployee(){
        EmployeeRace employeeRace = EmployeeRaceFactory.getEmployeeRace("55","2");
        Assert.assertEquals("55",employeeRace.getEmployeeId());
    }
}