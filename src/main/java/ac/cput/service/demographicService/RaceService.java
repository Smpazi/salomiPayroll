package ac.cput.service.demographicService;

import ac.cput.domain.demographic.Race;
import ac.cput.service.IService;

import java.util.Map;

public interface RaceService extends IService<Race, String> {
    Map<String,Race> getAll();
}
