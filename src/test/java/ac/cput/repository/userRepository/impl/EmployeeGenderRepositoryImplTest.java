package ac.cput.repository.userRepository.impl;

import ac.cput.domain.user.EmployeeGender;
import ac.cput.factory.userFactory.EmployeeGenderFactory;
import ac.cput.repository.userRepository.EmployeeGenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest {

    Map<String,String> values;
    private EmployeeGenderRepository employeeGenderRepository;
    private EmployeeGender employeeGender;

    @Before
    public  void setUp() throws Exception{
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
        values= new HashMap<>();
        values.put("EmployeeId","E7");
        values.put("GenderID","M7");

        this.employeeGender = EmployeeGenderFactory.getEmployeeGender(values);

    }
    @Test
    public   void create(){
        EmployeeGender createdGender = this.employeeGenderRepository.create(employeeGender);
        System.out.println("Created." + createdGender);
        employeeGenderRepository.create(createdGender);
        Assert.assertSame(createdGender, this.employeeGender);
    }

    @Test
    public void read() {
        EmployeeGender employee = new EmployeeGender().employeeGender(values.get("EmployeeId"), values.get("GenderID"));

        employeeGenderRepository.create(employee);
        EmployeeGender employeeG = employeeGenderRepository.read("E7");

        assertEquals("M7", employeeG.getGenderId());
        System.out.println("In read, read = " + employeeG.getGenderId());
    }
    @Test
    public void update()  {
        EmployeeGender updateEmpl = new EmployeeGender()
                .employeeGender(values.get("EmployeeId"), "F23");

        employeeGenderRepository.update(updateEmpl);
        EmployeeGender employeeG = employeeGenderRepository.read("E7");

        assertEquals("F23", employeeG.getGenderId());
        System.out.println("In update, update = " + employeeG.getGenderId());

    }


    @Test
    public void delete() {

        this.employeeGenderRepository.delete("E7");
        EmployeeGender employee= employeeGenderRepository.read("E7");
        assertNull(employee);

    }

    @Test
    public void  getAll(){
        Map<String,EmployeeGender> all = this.employeeGenderRepository.getAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }


}