package ac.cput.repository.userRepository;

import ac.cput.domain.user.EmployeeRace;
import ac.cput.repository.IRepository;

import java.util.Map;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace, String> {
    Map<String,EmployeeRace> getAll();
}
