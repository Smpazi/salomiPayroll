package ac.cput.repository.demographicRepository.impl;

import ac.cput.domain.demographic.Gender;
import ac.cput.repository.demographicRepository.GenderRepository;

import java.util.HashMap;
import java.util.Map;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl genderRepository =null;
    private Map<String,Gender> genderMap;

    private GenderRepositoryImpl(){
        this.genderMap =new HashMap<>();
    }

    public static GenderRepositoryImpl getGenderRepository() {
        if(genderRepository==null)
            genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }

    @Override
    public Map<String, Gender> getAll() {
        return genderMap;
    }

    @Override
    public Gender create(Gender gender) {
        genderMap.put(gender.getGenderId(),gender);
        Gender gender1= genderMap.get(gender.getGenderId());
        return gender1;
    }

    @Override
    public Gender update(Gender gender) {
        Gender gender1 = read(gender.getGenderId());
        if (gender1 != null){
            Gender updatedGender = new Gender.Builder()
                    .copy(gender1)
                    .descr_gender(gender.getGenderId())
                    .build();
            this.genderMap.remove(gender1);
            this.genderMap.put(gender.getGenderId(),updatedGender);
            gender1= updatedGender;
        }
        return gender1;
    }

    @Override
    public Gender read(String s) {
        Gender gender = genderMap.get(s);
        return gender;
    }

    @Override
    public void delete(String s) {
        genderMap.remove(s);
    }

}
