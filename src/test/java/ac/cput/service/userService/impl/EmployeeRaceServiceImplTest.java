package ac.cput.service.userService.impl;

import ac.cput.domain.user.EmployeeRace;
import ac.cput.factory.userFactory.EmployeeRaceFactory;
import ac.cput.repository.userRepository.EmployeeRaceRepository;
import ac.cput.repository.userRepository.impl.EmployeeRaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EmployeeRaceServiceImplTest {
    Map<String,String> values;
    private EmployeeRaceRepository employeeRaceRepository;
    private EmployeeRace employeeRace;

    @Before
    public  void setUp() throws Exception{
        this.employeeRaceRepository = EmployeeRaceRepositoryImpl.getEmployeeRaceRepository();
        values= new HashMap<>();
        values.put("EmployeeGenderId","222");
        values.put("GenderID","F23");

        this.employeeRace = EmployeeRaceFactory.getEmployeeRace(" "," ");

    }
    @Test
    public   void create(){
        EmployeeRace createdRace = this.employeeRaceRepository.create(employeeRace);
        System.out.println("Created." + createdRace);
        employeeRaceRepository.create(createdRace);
        Assert.assertSame(createdRace, this.employeeRace);
    }

    @Test
    public void read() {
        EmployeeRace employeeRace = new EmployeeRace().employeeRace(values.get("EmployeeGenderId"), values.get("GenderID"));

        employeeRaceRepository.create(employeeRace);
        EmployeeRace employeeG = employeeRaceRepository.read("222");

        assertEquals("F23", employeeG.getEmployeeId());
        System.out.println("In read, read = " + employeeG.getEmployeeId());
    }
    @Test
    public void update()  {
        EmployeeRace employeeRace = new EmployeeRace()
                .employeeRace(values.get("EmployeeGenderId"), values.get("GenderID"));

        employeeRaceRepository.create(employeeRace);
        EmployeeRace employeeG = employeeRaceRepository.read("222");

        assertEquals("F23", employeeG.getEmployeeId());
        System.out.println("In read, read = " + employeeG.getEmployeeId());

    }


    @Test
    public void delete() {

        this.employeeRaceRepository.delete("212");
        EmployeeRace employee= employeeRaceRepository.read("D33");
        assertNull(employee);

    }

    @Test
    public void  getAll(){
        Map<String,EmployeeRace> all = this.employeeRaceRepository.getAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }
}