package za.ac.cput.factory.contact;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.contact.Contact;
import za.ac.cput.entity.identity.Employee;
import za.ac.cput.factory.identity.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

class ContactFactoryTest {

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

    public Contact contact1 = ContactFactory.createContact(employee1,
            "0845687415", "+215412365", "Sitcheu@gmail.com");
    public Contact contact2 = ContactFactory.createContact(employee2,
            "0848067672", "+212016189", "Siani@gmail.com");

    @Test
    void createContact() {
        assertNotSame(contact1, contact2);
        assertNotNull(contact1);
        System.out.println(contact1);
    }
}