package ac.cput.service.demographicService.impl;

import ac.cput.domain.demographic.Race;
import ac.cput.factory.demographicFactory.RaceFactory;
import ac.cput.repository.demographicRepository.RaceRepository;
import ac.cput.repository.demographicRepository.impl.RaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RaceServiceImplTest {
    Map<String,String> values;
    private RaceRepository raceRepository;
    private Race race;

    @Before
    public  void setUp() throws Exception{
        this.raceRepository = RaceRepositoryImpl.getRaceRepository();
        values= new HashMap<>();
        values.put("GenderId","M44");
        values.put("Gender","Female");

        this.race = RaceFactory.getRace(values);

    }
    @Test
    public   void create(){
        Race created = this.raceRepository.create(race);
        System.out.println("Created." + created);
        raceRepository.create(created);
        Assert.assertSame(created, this.race);
    }

    @Test
    public void read() {
        Race race = new Race.Builder()
                .raceId(values.get("GenderId"))
                .discr_race(values.get("Gender"))
                .build();
        raceRepository.create(race);
        Race race1 = raceRepository.read("M44");

        assertEquals("Female", race1.getDescr_race());

        System.out.println("In read, read = " + race1.getDescr_race());
    }
    @Test
    public void update()  {
        Race race = new Race.Builder()
                .raceId(values.get("GenderId"))
                .discr_race(values.get("Gender"))
                .build();
        raceRepository.create(race);
        Race race1 = raceRepository.read("M44");

        assertEquals("Female", race1.getDescr_race());

        System.out.println("IN Update = " + race1.getDescr_race());

    }


    @Test
    public void delete() {

        this.raceRepository.delete("");
        Race race= raceRepository.read("M44");
        assertNull(race);

    }

    @Test
    public void  getAll(){
        Map<String,Race> all = this.raceRepository.getAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }


}