package ac.cput.service.userService;

import ac.cput.domain.user.Employee;
import ac.cput.service.IService;

import java.util.Map;

public interface EmployeeService extends IService<Employee, String> {

    Map<String, Employee> getAll();
}

