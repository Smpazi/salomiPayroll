package ac.cput.service.userService.impl;

import ac.cput.domain.user.EmployeeGender;
import ac.cput.repository.userRepository.EmployeeGenderRepository;
import ac.cput.repository.userRepository.impl.EmployeeGenderRepositoryImpl;
import ac.cput.service.userService.EmployeeGenderService;

import java.util.Map;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderServiceImpl employeeGenderService = null;

    EmployeeGenderRepository employeeGenderRepository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();

    public static EmployeeGenderServiceImpl getEmployeeGenderService() {
        if(employeeGenderService == null)
            employeeGenderService = new EmployeeGenderServiceImpl();
        return employeeGenderService;
    }

    @Override
    public Map<String, EmployeeGender> getAll() {
        return employeeGenderRepository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return employeeGenderRepository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return employeeGenderRepository.update(employeeGender);
    }

    @Override
    public void delete(String s) {
        this.employeeGenderRepository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return employeeGenderRepository.read(s);
    }
}
