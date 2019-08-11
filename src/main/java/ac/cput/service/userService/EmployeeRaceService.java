package ac.cput.service.userService;

import ac.cput.domain.user.EmployeeRace;
import ac.cput.service.IService;

import java.util.Map;

public interface EmployeeRaceService extends IService<EmployeeRace, String> {
    Map<String, EmployeeRace> getAll();
}
