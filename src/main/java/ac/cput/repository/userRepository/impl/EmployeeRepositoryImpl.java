package ac.cput.repository.userRepository.impl;

import ac.cput.domain.user.Employee;
import ac.cput.repository.userRepository.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl employeeRepository =null;
    private Map<String,Employee> employeeMap;

    private EmployeeRepositoryImpl(){
        this.employeeMap =new HashMap<>();
    }

    public static EmployeeRepositoryImpl getEmployeeRepository() {
        if(employeeRepository==null)
            employeeRepository = new EmployeeRepositoryImpl();
        return employeeRepository;
    }

    @Override
    public Map<String, Employee> getAll() {
        return employeeMap;
    }

    @Override
    public Employee create(Employee employee) {
        employeeMap.put(employee.getEmployeeId(),employee);
        Employee employee1 =employeeMap.get(employee.getEmployeeId());
        return employee1;
    }

    @Override
    public Employee update(Employee employee) {
        Employee employeeOld = read(employee.getEmployeeId());
        if(employeeOld != null){
            Employee updatedEmployee = new Employee.Builder()
                    .copy(employeeOld)
                    .fName(employee.getfName())
                    .lName(employee.getlName())
                    .build();
            this.employeeMap.remove(employeeOld);
            this.employeeMap.put(employee.getEmployeeId(),updatedEmployee);
            employeeOld = updatedEmployee;
        }
        return employeeOld;
    }

    @Override
    public Employee read(String s) {
        Employee employee = employeeMap.get(s);
        return employee;
    }

    @Override
    public void delete(String s) {
        employeeMap.remove(s);
    }
}
