package za.ac.cput.factory.demography;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.demography.Race;

import static org.junit.jupiter.api.Assertions.*;

class RaceFactoryTest {

    public Race race = RaceFactory.createRace("",
                                              "");
    @Test
    void createRace() {

    }
}