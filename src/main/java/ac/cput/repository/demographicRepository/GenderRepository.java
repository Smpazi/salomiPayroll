package ac.cput.repository.demographicRepository;

import ac.cput.domain.demographic.Gender;
import ac.cput.repository.IRepository;

import java.util.Map;

public interface GenderRepository extends IRepository<Gender, String> {
    Map<String,Gender> getAll();
}
