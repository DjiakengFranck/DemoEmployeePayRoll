package za.ac.cput.factory.contact;

import util.Helper;
import za.ac.cput.entity.contact.Address;
import za.ac.cput.entity.identity.Employee;

public class AddressFactory {
        public static Address createAddress(Employee employee,
                                            String streetAddress,
                                            String postalAddress,
                                            String email){
            if (Helper.isEmptyOrNull(streetAddress) ||
                Helper.isEmptyOrNull(postalAddress) ||
                Helper.isValidEmail(email)){
                return null;
            }
            return new Address.Builder()
                    .setEmployee(employee)
                    .setStreetAddress(streetAddress)
                    .setPostalAddress(postalAddress)
                    .setEmail(email)
                    .build();

        }
}
