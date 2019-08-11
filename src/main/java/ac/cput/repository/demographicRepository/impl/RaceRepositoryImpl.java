package ac.cput.repository.demographicRepository.impl;

import ac.cput.domain.demographic.Race;
import ac.cput.repository.demographicRepository.RaceRepository;

import java.util.HashMap;
import java.util.Map;

public class RaceRepositoryImpl implements RaceRepository {
    private static RaceRepositoryImpl raceRepository =null;
    private Map<String,Race> raceMap;

    private RaceRepositoryImpl(){
        this.raceMap =new HashMap<>();
    }

    public static RaceRepositoryImpl getRaceRepository() {
        if(raceRepository==null)
            raceRepository = new RaceRepositoryImpl();
        return raceRepository;
    }
    @Override
    public Map<String, Race> getAll() {
        return raceMap;
    }

    @Override
    public Race create(Race race) {
        raceMap.put(race.getRaceId(),race);
        Race race1 = raceMap.get(race.getRaceId());
        return race1;
    }

    @Override
    public Race update(Race race) {
       /* Race oldRace = read(race.getRaceId());
        if(oldRace!= null){
            Race updatedRace = new Race.Builder()
                    .discr_race(race.getDescr_race())
                    .build();
            this.raceMap.remove(oldRace);
            this.raceMap.put(race.getRaceId(),updatedRace);
            oldRace=updatedRace;
        }*/

       raceMap.put(race.getRaceId(),race);
       Race race1= raceMap.get(race.getRaceId());
        return race1;
    }

    @Override
    public Race read(String s) {
        Race race= raceMap.get(s);
        return race;
    }

    @Override
    public void delete(String s) {

        this.raceMap.remove(s);
    }
}
