package ac.cput.repository.userRepository.impl;

import ac.cput.domain.user.Employee;
import ac.cput.factory.userFactory.EmployeeFactory;
import ac.cput.repository.userRepository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    Map<String,String> values;
    private EmployeeRepository employeeRepository;
    private Employee employee;

    @Before
    public  void setUp() throws Exception{
        this.employeeRepository = EmployeeRepositoryImpl.getEmployeeRepository();
        values= new HashMap<>();
        values.put("EmployeeId","D33");
        values.put("Name","Salomi");
        values.put("Surname","Mpazi");

        this.employee = EmployeeFactory.getEmployee(values);

    }
    @Test
    public   void create(){
        Employee created = this.employeeRepository.create(employee);
        System.out.println("Created." + created);
        employeeRepository.create(created);
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void read() {
        Employee employee = new Employee.Builder()
                .employeeId(values.get("EmployeeId"))
                .fName(values.get("Name"))
                .lName(values.get("Surname"))
                .build();

        employeeRepository.create(employee);
        Employee employee1 = employeeRepository.read("D33");

        assertEquals("Salomi", employee1.getfName());
        System.out.println("In read, read = " + employee1.getfName());
    }
    @Test
    public void update()  {

          Employee updatedEmployee = new Employee.Builder()
                  .employeeId(values.get("EmployeeId"))
                  .fName("Zia")
                  .build();

          employeeRepository.update(updatedEmployee);
         Employee updateEmp = employeeRepository.read("D33");

        assertEquals("Zia",updateEmp.getfName());
        System.out.println("In update, updated = " + updateEmp.getfName());

    }


    @Test
    public void delete() {

        this.employeeRepository.delete("D33");
        Employee employee= employeeRepository.read("D33");
        assertNull(employee);

    }

    @Test
    public void  getAll(){
        Map<String,Employee> all = this.employeeRepository.getAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }



}