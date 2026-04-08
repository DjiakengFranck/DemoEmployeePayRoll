package za.ac.cput.factory.demography;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.demography.Gender;

import static org.junit.jupiter.api.Assertions.*;

class GenderFactoryTest {

    public Gender gender = GenderFactory.createGender("",
                                                       "");

    @Test
    void createGender() {

    }

}