package za.ac.cput.factory.contact;

import util.Helper;
import za.ac.cput.entity.contact.Contact;
import za.ac.cput.entity.identity.Employee;

public class ContactFactory {
    public static Contact createContact(Employee employee,
                                        String cellNumber,
                                        String homeNumber,
                                        String email){
        if (Helper.isEmptyOrNull(cellNumber) ||
            Helper.isEmptyOrNull(homeNumber) ||
            Helper.isValidEmail(email)){
            return null;
        }
        return new Contact.Builder()
                .setEmployee(employee)
                .setCellNumber(cellNumber)
                .setHomeNumber(homeNumber)
                .setEmail(email)
                .build();
    }
}
