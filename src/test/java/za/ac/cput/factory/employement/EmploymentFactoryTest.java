package za.ac.cput.factory.employement;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.employment.Employment;

import static org.junit.jupiter.api.Assertions.*;

class EmploymentFactoryTest {
    public Employment employment = EmploymentFactory.createEmployment(" ");

    @Test
    void createEmployment() {
        assertNotNull(employment);
        System.out.println(employment);
    }
}