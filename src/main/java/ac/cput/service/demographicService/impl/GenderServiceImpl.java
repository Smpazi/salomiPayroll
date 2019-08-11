package ac.cput.service.demographicService.impl;

import ac.cput.domain.demographic.Gender;
import ac.cput.repository.demographicRepository.GenderRepository;
import ac.cput.repository.demographicRepository.impl.GenderRepositoryImpl;
import ac.cput.service.demographicService.GenderService;

import java.util.Map;

public class GenderServiceImpl implements GenderService {
    private static GenderServiceImpl genderService = null;

    GenderRepository genderRepository = GenderRepositoryImpl.getGenderRepository();

    public static GenderServiceImpl getGenderService() {
        if(genderService == null)
            genderService = new GenderServiceImpl();
        return genderService;
    }

    @Override
    public Map<String, Gender> getAll() {
        return genderRepository.getAll();
    }


    @Override
    public Gender create(Gender gender) {
        return genderRepository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return genderRepository.update(gender);
    }

    @Override
    public void delete(String s) {
        genderRepository.delete(s);
    }

    @Override
    public Gender read(String s) {
        return genderRepository.read(s);
    }
}
