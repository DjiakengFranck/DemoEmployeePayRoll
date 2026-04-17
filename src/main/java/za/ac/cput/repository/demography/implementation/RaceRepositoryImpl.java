package za.ac.cput.repository.demography.Implementation;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.repository.demography.IRaceRepository;

import java.util.ArrayList;
import java.util.List;

public class RaceRepositoryImpl implements IRaceRepository {

    public List<Race> raceList;

    private RaceRepositoryImpl() {
        raceList = new ArrayList<>();
    }

    private static IRaceRepository raceRepository = null;

    public static IRaceRepository getInstance(){
        if (raceRepository == null){
            raceRepository = new RaceRepositoryImpl();
        }
        return raceRepository;
    }

    @Override
    public Race create(Race race) {
        raceList.add(race);
        return race;
    }

    @Override
    public Race read(String string) {
        for (Race race : raceList){
            if (race.getRaceId().equalsIgnoreCase(string)){
                return race;
            }
        }
        return null;
    }

    @Override
    public Race update(Race race) {
        Race oldRace = read(race.getRaceId());
        if (oldRace != null){
            raceList.remove(oldRace);
            raceList.add(race);
            return race;
        }
        return null;
    }

    @Override
    public boolean delete(String string) {
        Race race = read(string);
        if (race != null){
            raceList.remove(race);
            return true;
        }
        return false;
    }

    @Override
    public List<Race> getAllRace() {
        return raceList;
    }
}
