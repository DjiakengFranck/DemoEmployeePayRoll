package za.ac.cput.repository.demography;

import za.ac.cput.entity.demography.Demography;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IDemographyRepository extends IRepository<Demography, String> {

    List<Demography>getAllDemos();
    List<Demography>getDemographyByRace(String genderId);
    List<Demography>getDemographyByGender(String raceId);
}
