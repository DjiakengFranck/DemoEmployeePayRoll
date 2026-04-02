package za.ac.cput.factory.demography;

import util.Helper;
import za.ac.cput.entity.demography.Race;

public class RaceFactory {
    public static Race createRace(String raceId,
                                  String raceDesc){
        if (Helper.isEmptyOrNull(raceId) ||
            Helper.isEmptyOrNull(raceDesc)){
            return null;
        }
            return new Race.Builder()
                    .setRaceId(raceId)
                    .setRaceDesc(raceDesc)
                    .build();
    }
}
