package za.ac.cput.repository.contact;

import za.ac.cput.entity.contact.Contact;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IContactRepository extends IRepository<Contact, String>{

    List<Contact>getAllContact();
    List<Contact>getAllContactByCellNumber(String cellNumber);
    List<Contact>getAllContactByHomeNumber(String homeNumber);

}
