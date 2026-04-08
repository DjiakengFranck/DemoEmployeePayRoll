package za.ac.cput.repository.contact.Implementation;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.contact.Address;
import za.ac.cput.entity.identity.Employee;
import za.ac.cput.factory.contact.AddressFactory;
import za.ac.cput.factory.identity.EmployeeFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressRepositoryImplTest {

    private AddressRepositoryImpl addressRepository = (AddressRepositoryImpl) AddressRepositoryImpl.getInstance();

    private Employee employee1 = EmployeeFactory.createEmployee("",
            "Micheal",
            "Johnson",
            "Senegalese");
    private Employee employee2 = EmployeeFactory.createEmployee("",
            "Dimitri",
            "Damson",
            "Egypt");
    private Address address = AddressFactory.createAddress(employee1,
            "84 Royal Road",
            "7460",
            "Siani@gmail.com");
    private Address address1 = AddressFactory.createAddress(employee2,
            "76 Suffolk Street",
            "7460",
            "Siani@gmail.com");


    @Test
    void create() {
        addressRepository.create(address);
        assertNotNull(address);
        assertEquals("7460", address.getPostalAddress());
        System.out.println(address);
    }

    @Test
    void read() {
        addressRepository.read(address.getStreetAddress());
        assertNotNull(address);
        assertEquals("84 Royal Road", address.getStreetAddress());
        System.out.println(address);
    }

    @Test
    void update() {
        addressRepository.create(address);
        address = new Address.Builder()
                .copy(address)
                .setPostalAddress("8402")
                .setStreetAddress("Joubert Street")
                .build();
        assertNotNull(address);
        assertEquals("8402", address.getPostalAddress());
        System.out.println(address);
    }

    @Test
    void delete() {
        addressRepository.create(address);
        boolean delete = addressRepository.delete("Joubert Street");
        System.out.println(delete);
    }

    @Test
    void getAllAddresses() {
        addressRepository.create(address);
        List<Address> results = addressRepository.getAllAddresses();
        assertNotNull(results);
        assertFalse(results.isEmpty());
        System.out.println(address);

    }

    @Test
    void getAllAddressesByProvinces() {
        addressRepository.create(address);
        addressRepository.create(address1);
        List<Address> results = addressRepository.getAllAddressesByProvinces("7460");
        assertNotNull(results);
        assertFalse(results.isEmpty());
        System.out.println(results);
    }

    @Test
    void getAllAddressesByCities() {
        addressRepository.create(address);
        addressRepository.create(address1);
        List<Address> results = addressRepository.getAllAddressesByCities("8451");
        assertNotNull(results);
        assertFalse(results.isEmpty());
        System.out.println(results);
    }
}