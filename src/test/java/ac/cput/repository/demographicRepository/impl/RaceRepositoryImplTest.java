package ac.cput.repository.demographicRepository.impl;

import ac.cput.domain.demographic.Race;
import ac.cput.factory.demographicFactory.RaceFactory;
import ac.cput.repository.demographicRepository.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {
    Map<String,String> values;
    private RaceRepository raceRepository;
    private Race race;

    @Before
    public  void setUp() throws Exception{

        this.raceRepository = RaceRepositoryImpl.getRaceRepository();
        values= new HashMap<>();
        values.put("RaceId","B4");
        values.put("Race","Black");

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
                .raceId(values.get("RaceId"))
                .discr_race(values.get("Race"))
                .build();
        raceRepository.create(race);
        Race race1 = raceRepository.read("B4");

        assertEquals("Black", race1.getDescr_race());

        System.out.println("In read, read = " + race1.getDescr_race());
    }
    @Test
    public void update()  {
        Race race = new Race.Builder()
                .raceId(values.get("RaceId"))
                .discr_race("White")
                .build();
        raceRepository.create(race);
        Race race1 = raceRepository.read("B4");

        assertEquals("White", race1.getDescr_race());

        System.out.println("In Update = " + race1.getDescr_race());

    }


    @Test
    public void delete() {

        this.raceRepository.delete("B4");
        Race race= raceRepository.read("B4");
        assertNull(race);

    }

    @Test
    public void  getAll(){
        Map<String,Race> all = this.raceRepository.getAll();
        Assert.assertNotNull(all);
        System.out.println(all);
    }

}