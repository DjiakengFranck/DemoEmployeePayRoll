package za.ac.cput.factory.employement;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.employment.Job;
import za.ac.cput.entity.employment.Position;

import static org.junit.jupiter.api.Assertions.*;

class PositionFactoryTest {

    public Job job2 = JobFactory.createJob("Security",
            "In Charge diffusing any form of disruption at the work space");

    public Position position = PositionFactory.createPosition(" ",
                                                                job2);

    @Test
    void createPosition() {
        assertNotNull(position);
        assertEquals(position.getPositionCode(), " ");
        System.out.println("-------------------------------");
        System.out.println(position);

    }
}