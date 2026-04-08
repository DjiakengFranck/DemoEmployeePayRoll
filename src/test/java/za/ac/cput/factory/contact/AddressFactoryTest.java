package za.ac.cput.factory.contact;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.contact.Address;
import za.ac.cput.entity.identity.Employee;
import za.ac.cput.factory.identity.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

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

    private Address address1 = AddressFactory.createAddress(
            employee1,
            "85 Royal Road Gugulethu",
            "7405",
            "siani@gmail.com");
    private Address address2 = AddressFactory.createAddress(
            employee2,
            "85 Royal Road Gugulethu",
            "7405",
            "siani@gmail.com");
    private Address address3 = AddressFactory.createAddress(
            employee3,
            "85 Royal Road Gugulethu",
            "7405",
            "siani@gmail.com");
    private Address address4 = AddressFactory.createAddress(
            employee4,
            "85 Royal Road Gugulethu",
            "7405",
            "siani@gmail.com");

    @Test
    void createAddress() {
        assertNotNull(address1);
        assertNotNull(address2);
        assertNotNull(address3);
        assertNotNull(address4);
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);
    }
}