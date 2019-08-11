package ac.cput.repository.userRepository;

import ac.cput.domain.user.Employee;
import ac.cput.domain.user.EmployeeGender;
import ac.cput.repository.IRepository;

import java.util.Map;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {
    Map<String, EmployeeGender> getAll();

}
