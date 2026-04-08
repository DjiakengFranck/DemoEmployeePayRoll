package za.ac.cput.repository.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IRaceRepository extends IRepository<Race, String> {
    List<Race>getAllRace();
}
