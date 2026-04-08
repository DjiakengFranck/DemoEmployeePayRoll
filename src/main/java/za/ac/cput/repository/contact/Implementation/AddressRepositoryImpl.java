package za.ac.cput.repository.contact.Implementation;

import za.ac.cput.entity.contact.Address;
import za.ac.cput.entity.identity.Employee;
import za.ac.cput.repository.contact.IAddressRepository;

import java.util.ArrayList;
import java.util.List;

public class AddressRepositoryImpl implements IAddressRepository {


    public List<Address> addressList;

    private AddressRepositoryImpl() {
        addressList = new ArrayList<>();
    }

    private static IAddressRepository repository = null;

    public static IAddressRepository getInstance(){
        if(repository == null){
            repository = new AddressRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Address create(Address address) {
        addressList.add(address);
        return address;
    }

    @Override
    public Address read(String string) {
        for (Address address : addressList){
            if (address.getStreetAddress().equalsIgnoreCase(string)){
                return address;
            }
        }
        return null;
    }

    @Override
    public Address update(Address address) {
        Address oldAddress = read(address.getStreetAddress());
        if(oldAddress != null){
            addressList.remove(oldAddress);
            addressList.add(address);
            return address;
        }
        return null;
    }

    @Override
    public boolean delete(String string) {
        Address address = read(string);
        if (address != null){
            addressList.remove(address);
            return true;
        }
        return false;
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressList;
    }

    @Override
    public List<Address> getAllAddressesByProvinces(String postAdd) {
        List<Address> results = new ArrayList<>();
        for (Address address : addressList){
            if (address.getPostalAddress().equalsIgnoreCase(postAdd)){
                results.add(address);
            }
        }
        return results;
    }

    @Override
    public List<Address> getAllAddressesByCities(String postAdd) {
        List<Address> results = new ArrayList<>();
        for (Address address : addressList){
            if (address.getPostalAddress().equalsIgnoreCase(postAdd)){
                results.add(address);
            }
        }
        return results;
    }
}
