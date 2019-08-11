package ac.cput.repository.demographicRepository.impl;

import ac.cput.domain.demographic.Gender;
import ac.cput.factory.demographicFactory.GenderFactory;
import ac.cput.repository.demographicRepository.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {
    Map<String,String> values;
    private GenderRepository genderRepository;
    private Gender gender;

    @Before
    public  void setUp() throws Exception{
        this.genderRepository = GenderRepositoryImpl.getGenderRepository();
        values= new HashMap<>();
        values.put("GenderId","M44");
        values.put("Gender","Female");

        this.gender = GenderFactory.getGender(values);

    }
    @Test
    public   void create(){
        Gender created = this.genderRepository.create(gender);
        System.out.println("Created." + created);
        genderRepository.create(created);
        Assert.assertSame(created, this.gender);
    }

    @Test
    public void read() {
        Gender gender = new Gender.Builder()
                .genderId(values.get("GenderId"))
                .descr_gender(values.get("Gender"))
                .build();
        genderRepository.create(gender);
        Gender gender1 = genderRepository.read("M44");

        assertEquals("Female", gender1.getDescr_gender());

        System.out.println("In read, read = " + gender1.getDescr_gender());
    }
    @Test
    public void update()  {
        //  Employee employOld = employeeRepository.read("D33");

        Gender gender = new Gender.Builder()
                .genderId(values.get("GenderId"))
                .descr_gender("Male")
                .build();
        genderRepository.create(gender);
        Gender gender1 = genderRepository.read("M44");

        assertEquals("Male", gender1.getDescr_gender());
        System.out.println("In update, updated = " + gender1.getDescr_gender());

    }


    @Test
    public void delete() {

        this.genderRepository.delete("M44");
        Gender gender= genderRepository.read("M44");
        assertNull(gender);

    }

    @Test
    public void  getAll(){
        Map<String,Gender> all = this.genderRepository.getAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }

}