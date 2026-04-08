package za.ac.cput.factory.identity;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.identity.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    private Employee employee1 = EmployeeFactory.createEmployee("",
                                                                "Micheal",
                                                                "Jhonson",
                                                                "Senegalese");
    private Employee employee2 = EmployeeFactory.createEmployee("",
            "Dimitri",
            "Dampson",
            "Egypt");
    private Employee employee3 = EmployeeFactory.createEmployee("",
            "Skylar",
            "Simpson",
            "Ghana");
    private Employee employee4 = EmployeeFactory.createEmployee("",
            "Thiery",
            "Thompson",
            "Mali");


    @Test
    void createEmployee() {
        assertNotNull(employee1);
        assertEquals(employee1.getNationality(), "Senegalese");
        assertNotNull(employee2);
        assertNotNull(employee3);
        assertNotNull(employee4);
        assertEquals(employee2.getLastName(), "Dampson");
        System.out.println(employee1);
        System.out.println("------------------------------------");
        System.out.println(employee2);
        System.out.println("------------------------------------");
        System.out.println(employee3);
        System.out.println("------------------------------------");
        System.out.println(employee4);

    }
}