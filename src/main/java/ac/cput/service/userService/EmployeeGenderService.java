package ac.cput.service.userService;

import ac.cput.domain.user.EmployeeGender;
import ac.cput.service.IService;

import java.util.Map;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Map<String, EmployeeGender> getAll();

}
