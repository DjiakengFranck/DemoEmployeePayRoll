package za.ac.cput.factory.identity;

import util.Helper;
import za.ac.cput.entity.employment.Position;
import za.ac.cput.entity.identity.Employee;
import za.ac.cput.entity.identity.Identity;

public class EmployeeFactory {
    public static Employee createEmployee(String empNumber,
                                          String firstName,
                                          String lastName,
                                          String nationality){
        empNumber= Helper.generateId(empNumber);
        if (Helper.isEmptyOrNull(firstName) ||
            Helper.isEmptyOrNull(lastName) ||
            Helper.isEmptyOrNull(nationality)){
            return null;
        }
        return new Employee.Builder()
                .setEmpNumber(empNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setNationality(nationality)
                .build();

    }
}
