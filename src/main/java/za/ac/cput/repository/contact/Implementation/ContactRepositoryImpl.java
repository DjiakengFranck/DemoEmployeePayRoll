package za.ac.cput.repository.contact.Implementation;

import za.ac.cput.entity.contact.Contact;
import za.ac.cput.repository.contact.IContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements IContactRepository {

    public List<Contact> contactList;

    private ContactRepositoryImpl() {
        contactList = new ArrayList<>();
    }
    private static IContactRepository contactRepository = null;

    public static IContactRepository getInstance(){
        if (contactRepository == null){
            contactRepository = new ContactRepositoryImpl();
        }
        return contactRepository;
    }

    @Override
    public Contact create(Contact contact) {
        contactList.add(contact);
        return contact;
    }

    @Override
    public Contact read(String string) {
        for (Contact contact : contactList){
            if (contact.getCellNumber().equalsIgnoreCase(string)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        Contact odlContact = read(contact.getCellNumber());
        if (odlContact != null){
            contactList.remove(odlContact);
            contactList.add(contact);
            return contact;
        }
        return null;
    }

    @Override
    public boolean delete(String string) {
        Contact oldContact = read(string);
        if (oldContact != null){
            contactList.remove(oldContact);
            return true;
        }
        return false;
    }

    @Override
    public List<Contact> getAllContact() {
        return contactList;
    }

    @Override
    public List<Contact> getAllContactByCellNumber(String cellNumber) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contactList){
            if (contact.getCellNumber().equalsIgnoreCase(cellNumber)){
                results.add(contact);
            }
        }
        return results;
    }

    @Override
    public List<Contact> getAllContactByHomeNumber(String homeNumber) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contactList){
            if (contact.getHomeNumber().equalsIgnoreCase(homeNumber)){
                results.add(contact);
            }
        }
        return results;
    }
}
