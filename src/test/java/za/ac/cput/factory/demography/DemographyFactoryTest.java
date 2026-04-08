package za.ac.cput.factory.demography;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.demography.Demography;

import static org.junit.jupiter.api.Assertions.*;

class DemographyFactoryTest {

    public Demography demography1 = DemographyFactory.createDemography("",
                                                                        "2016189",
                                                                                "8067672");

    public Demography demography2 = DemographyFactory.createDemography("",
            "Male",
            "African/American");

    public Demography demography3 = DemographyFactory.createDemography("",
            "Female",
            "Indian");

    @Test
    void createDemography() {
        assertNotNull(demography1);
        assertNotSame(demography2, demography3);
        System.out.println(demography1);
    }

}