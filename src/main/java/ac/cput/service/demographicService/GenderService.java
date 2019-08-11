package ac.cput.service.demographicService;

import ac.cput.domain.demographic.Gender;
import ac.cput.service.IService;

import java.util.Map;

public interface GenderService extends IService<GenderService,String> {
    Map<String, Gender> getAll();
}
