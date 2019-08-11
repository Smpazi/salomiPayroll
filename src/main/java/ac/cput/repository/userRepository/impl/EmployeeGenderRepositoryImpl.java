package ac.cput.repository.userRepository.impl;

import ac.cput.domain.user.Employee;
import ac.cput.domain.user.EmployeeGender;
import ac.cput.repository.userRepository.EmployeeGenderRepository;

import java.util.HashMap;
import java.util.Map;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

    private static EmployeeGenderRepositoryImpl employeeGenderRepository =null;
    private Map<String, EmployeeGender> employeeGenderMap;

    private EmployeeGenderRepositoryImpl(){
        this.employeeGenderMap=new HashMap<>();
    }

    public static EmployeeGenderRepositoryImpl getEmployeeGenderRepository() {
        if(employeeGenderRepository==null)
            employeeGenderRepository = new EmployeeGenderRepositoryImpl();
        return employeeGenderRepository;
    }
    @Override
    public Map<String, EmployeeGender> getAll() {
        return employeeGenderMap;
    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public Employee read(String s) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
