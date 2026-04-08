package za.ac.cput.repository.contact;

import za.ac.cput.entity.contact.Address;
import za.ac.cput.entity.identity.Employee;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IAddressRepository extends IRepository<Address, String>{

    List<Address> getAllAddresses();
    List<Address> getAllAddressesByProvinces(String postAdd);
    List<Address> getAllAddressesByCities(String postAdd);
}
