package za.ac.cput.factory.demography;

import util.Helper;
import za.ac.cput.entity.demography.Gender;

public class GenderFactory {
    public static Gender createGender(String genderId,
                                      String genderDesc){
        if(Helper.isEmptyOrNull(genderId) ||
           Helper.isEmptyOrNull(genderDesc)){
            return null;
        }
        return new Gender.Builder()
                .setGenderId(genderId)
                .setGenderDesc(genderDesc)
                .build();

    }
}
