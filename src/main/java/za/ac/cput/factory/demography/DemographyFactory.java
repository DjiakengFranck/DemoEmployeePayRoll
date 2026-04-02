package za.ac.cput.factory.demography;

import util.Helper;
import za.ac.cput.entity.demography.Demography;

public class DemographyFactory {
    public static Demography createDemography(String employeeNum,
                                              String genderId,
                                              String raceId){
        employeeNum = Helper.generateId(employeeNum);
        if (Helper.isEmptyOrNull(genderId) ||
            Helper.isEmptyOrNull(raceId)){
            return null;
        }
        return new Demography.Builder()
                .setEmployeeNum(employeeNum)
                .setGenderId(genderId)
                .setRaceId(raceId)
                .build();
    }
}
