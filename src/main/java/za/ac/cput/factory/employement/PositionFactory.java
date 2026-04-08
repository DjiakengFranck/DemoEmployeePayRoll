package za.ac.cput.factory.employement;

import util.Helper;
import za.ac.cput.entity.employment.Job;
import za.ac.cput.entity.employment.Position;

public class PositionFactory {
    public static Position createPosition(String positionCode,
                                          Job jobDetails){
        if (Helper.isEmptyOrNull(positionCode)){
            return null;
        }
        return new Position.Builder()
                .setPositionCode(positionCode)
                .setJobDetails(jobDetails)
                .build();

    }
}
