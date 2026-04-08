package za.ac.cput.factory.employement;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.employment.Job;

import static org.junit.jupiter.api.Assertions.*;

class JobFactoryTest {
    public Job job1 = JobFactory.createJob("Talent Acquisition",
                                          "In Charge recruiting new Employees in the work Space");
    public Job job2 = JobFactory.createJob("Security",
                                          "In Charge diffusing any form of disruption at the work space");

    @Test
    void createJob() {
        assertNotNull(job1);
        assertNotNull(job2);
        assertNotSame(job1, job2);
        assertEquals(job2.getJobTitle(), "Security");
        System.out.println(job1);
        System.out.println("-----------------------");
        System.out.println(job2);
    }
}