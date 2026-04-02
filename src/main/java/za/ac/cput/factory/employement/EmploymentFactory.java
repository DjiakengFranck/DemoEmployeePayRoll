package za.ac.cput.factory.employement;

import util.Helper;
import za.ac.cput.entity.employment.Employment;

public class EmploymentFactory {
    public static Employment createEmployment(String employmentID){
        if (Helper.isEmptyOrNull(employmentID)){
            return null;
        }
        return new Employment.Builder().setEmploymentID(employmentID).build();
    }
}
