package ac.cput.service.demographicService.impl;

import ac.cput.domain.demographic.Race;
import ac.cput.repository.demographicRepository.RaceRepository;
import ac.cput.repository.demographicRepository.impl.RaceRepositoryImpl;
import ac.cput.service.demographicService.RaceService;

import java.util.Map;

public class RaceServiceImpl implements RaceService {
    private static RaceServiceImpl raceService = null;

    RaceRepository raceRepository = RaceRepositoryImpl.getRaceRepository();

    public static RaceServiceImpl getRaceService() {
        if(raceService == null)
            raceService = new RaceServiceImpl();
        return raceService;
    }

    @Override
    public Map<String, Race> getAll() {
        return raceRepository.getAll();
    }

    @Override
    public Race create(Race race) {
        return raceRepository.create(race);
    }

    @Override
    public Race update(Race race) {
        return raceRepository.update(race);
    }

    @Override
    public void delete(String s) {
        raceRepository.delete(s);
    }

    @Override
    public Race read(String s) {
        return raceRepository.read(s);
    }
}
