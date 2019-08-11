package ac.cput.repository.userRepository.impl;

import ac.cput.domain.user.EmployeeRace;
import ac.cput.factory.userFactory.EmployeeRaceFactory;
import ac.cput.repository.userRepository.EmployeeRaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EmployeeRaceRepositoryImplTest {
    Map<String,String> values;
    private EmployeeRaceRepository employeeRaceRepository;
    private EmployeeRace employeeRace;

    @Before
    public  void setUp() throws Exception{
        this.employeeRaceRepository = EmployeeRaceRepositoryImpl.getEmployeeRaceRepository();

        this.employeeRace = EmployeeRaceFactory.getEmployeeRace("E7","B4");

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
        EmployeeRace employeeRace = new EmployeeRace().employeeRace("B4","E7");

        employeeRaceRepository.create(employeeRace);
        EmployeeRace employeeG = employeeRaceRepository.read("B4");

        assertEquals("E7", employeeG.getEmployeeId());
        System.out.println("In read, read = " + employeeG.getEmployeeId());
    }
    @Test
    public void update()  {
        EmployeeRace updateEmpRace = new EmployeeRace()
                .employeeRace("B4","E5");

        employeeRaceRepository.update(updateEmpRace);
        EmployeeRace employeeG = employeeRaceRepository.read("B4");

        assertEquals("E5", employeeG.getEmployeeId());
        System.out.println("In update, update = " + employeeG.getEmployeeId());

    }


    @Test
    public void delete() {

        this.employeeRaceRepository.delete("B4");
        EmployeeRace employee= employeeRaceRepository.read("B4");
        assertNull(employee);

    }

    @Test
    public void  getAll(){
        Map<String,EmployeeRace> all = this.employeeRaceRepository.getAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }


}