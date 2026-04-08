package za.ac.cput.repository.contact.Implementation;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.contact.Contact;
import za.ac.cput.entity.identity.Employee;
import za.ac.cput.factory.contact.ContactFactory;
import za.ac.cput.factory.identity.EmployeeFactory;
import za.ac.cput.repository.contact.IContactRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {

    private static IContactRepository contactRepository = ContactRepositoryImpl.getInstance();
    private Employee employee3 = EmployeeFactory.createEmployee("",
            "Skylar",
            "Simpson",
            "Ghana");
    private Employee employee4 = EmployeeFactory.createEmployee("",
            "Thiery",
            "Thompson",
            "Mali");

    public Contact contact1 = ContactFactory.createContact(employee3,
            "0848067672", "+215412365", "Sitcheu@gmail.com");
    public Contact contact2 = ContactFactory.createContact(employee4,
            "0848067672", "+212016189", "Siani@gmail.com");

    @Test
    void create() {
        contactRepository.create(contact1);
        contactRepository.create(contact2);
        assertNotNull(contact1);
        System.out.println(contact1 + "\n" + contact2);;
    }

    @Test
    void read() {
        contactRepository.read(contact1.toString());
        contactRepository.read(contact2.getCellNumber());
        assertNotNull(contact1);
        assertNotNull(contact2);
        System.out.println(contact1 + "\n" + contact2);
    }

    @Test
    void update() {
        contactRepository.create(contact1);
        contact1 = new Contact.Builder()
                .copy(contact1)
                .setCellNumber("0813107472")
                .setEmail("djiakengfranck@gmail.com")
                .build();
        assertNotNull(contact1);
        System.out.println(contact1);
    }

    @Test
    void delete() {
        contactRepository.create(contact1);
        boolean delete = contactRepository.delete("0845687415");
        System.out.println(contact1);
    }

    @Test
    void getAllContact() {
        contactRepository.create(contact1);
        contactRepository.create(contact2);
        List<Contact> results = contactRepository.getAllContact();
        assertNotNull(results);
        assertFalse(results.isEmpty());
        System.out.println(results);
    }

    @Test
    void getAllContactByCellNumber() {
        contactRepository.create(contact1);
        contactRepository.create(contact2);
        List<Contact> results = contactRepository.getAllContactByCellNumber("0848067672");
        assertNotNull(results);
        assertFalse(results.isEmpty());
        System.out.println(results);

    }

    @Test
    void getAllContactByHomeNumber() {
        contactRepository.create(contact1);
        contactRepository.create(contact2);
        List<Contact> results = contactRepository.getAllContactByHomeNumber("+212016189");
        assertNotNull(results);
        assertFalse(results.isEmpty());
        System.out.println(results);

    }
}