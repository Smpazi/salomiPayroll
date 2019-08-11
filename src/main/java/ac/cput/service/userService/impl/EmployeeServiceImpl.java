package ac.cput.service.userService.impl;

import ac.cput.domain.user.Employee;
import ac.cput.repository.userRepository.EmployeeRepository;
import ac.cput.repository.userRepository.impl.EmployeeRepositoryImpl;
import ac.cput.service.userService.EmployeeService;

import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {


    private static EmployeeServiceImpl employeeService = null;

    EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getEmployeeRepository();

    public static EmployeeServiceImpl getEmployeeService() {
        if(employeeService == null)
            employeeService = new EmployeeServiceImpl();
        return employeeService;
    }

    @Override
    public Map<String, Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.update(employee);
    }

    @Override
    public void delete(String s) {
        employeeRepository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return employeeRepository.read(s);
    }
}
