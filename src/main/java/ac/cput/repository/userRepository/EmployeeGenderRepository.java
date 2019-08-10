package ac.cput.repository.userRepository;

import ac.cput.domain.user.Employee;
import ac.cput.repository.IRepository;

import java.util.Map;

public interface EmployeeGenderRepository extends IRepository<Employee, String> {
    Map<String, Employee> getAll();

}
