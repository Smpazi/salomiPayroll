package ac.cput.repository.userRepository.impl;

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
    public EmployeeGender create(EmployeeGender employeeGender) {
        employeeGenderMap.put(employeeGender.getEmployeeId(),employeeGender);
        EmployeeGender employeeGender1 = employeeGenderMap.get(employeeGender.getEmployeeId());
        return employeeGender1;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        employeeGenderMap.put(employeeGender.getEmployeeId(),employeeGender);
        EmployeeGender toUpdate = employeeGenderMap.get(employeeGender.getEmployeeId());
        return toUpdate;
    }

    @Override
    public EmployeeGender read(String s) {
        EmployeeGender employeeGender = employeeGenderMap.get(s);

        return employeeGender;
    }

    @Override
    public void delete(String s) {
        employeeGenderMap.remove(s);
    }
}
