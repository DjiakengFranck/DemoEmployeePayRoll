package za.ac.cput.repository.demography.Implementation;

import za.ac.cput.entity.demography.Demography;
import za.ac.cput.repository.demography.IDemographyRepository;

import java.util.ArrayList;
import java.util.List;

public class DemographyRepositoryImpl implements IDemographyRepository {

    public List<Demography> demographyList;

    private DemographyRepositoryImpl() {
        demographyList = new ArrayList<>();
    }

    private static IDemographyRepository demographyRepository = null;

    public static IDemographyRepository getInstance(){
        if (demographyRepository == null){
            demographyRepository = new DemographyRepositoryImpl();
        }
        return demographyRepository;
    }

    @Override
    public Demography create(Demography demography) {
        demographyList.add(demography);
        return demography;
    }

    @Override
    public Demography read(String string) {
        for (Demography demography : demographyList){
            if (demography.getEmployeeNum().equalsIgnoreCase(string)){
                return demography;
            }
        }
        return null;
    }

    @Override
    public Demography update(Demography demography) {
        Demography oldDemo = read(demography.getEmployeeNum());
        if (oldDemo != null){
            demographyList.remove(oldDemo);
            demographyList.add(demography);
            return demography;
        }
        return null;
    }

    @Override
    public boolean delete(String string) {
        Demography demography = read(string);
        if (demography != null){
            demographyList.remove(demography);
            return true;
        }
        return false;
    }

    @Override
    public List<Demography> getAllDemos() {
        return demographyList;
    }

    @Override
    public List<Demography> getDemographyByRace(String genderId) {
        List<Demography> results = new ArrayList<>();
        for (Demography demography : demographyList){
            if (demography.getRaceId().equalsIgnoreCase(genderId)){
                results.add(demography);
            }
        }
        return results;
    }

    @Override
    public List<Demography> getDemographyByGender(String raceId) {
        List<Demography> results = new ArrayList<>();
        for (Demography demography : demographyList){
            if (demography.getGenderId().equalsIgnoreCase(raceId)) {
                results.add(demography);
            }
        }
        return results;
    }
}
