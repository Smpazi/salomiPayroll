package ac.cput.repository.demographicRepository;

import ac.cput.domain.demographic.Race;
import ac.cput.repository.IRepository;

import java.util.Map;

public interface RaceRepository extends IRepository <Race,String> {
    Map<String,Race> getAll();

}
