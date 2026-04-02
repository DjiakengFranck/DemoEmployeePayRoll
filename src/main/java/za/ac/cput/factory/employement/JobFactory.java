package za.ac.cput.factory.employement;

import util.Helper;
import za.ac.cput.entity.employment.Job;

public class JobFactory {
    public static Job createJob(String jobTitle,
                                String jobDesc){
        if (Helper.isEmptyOrNull(jobTitle) ||
            Helper.isEmptyOrNull(jobDesc)){
            return null;
        }
        return new Job.Builder()
                .setJobTitle(jobTitle)
                .setJobDesc(jobDesc)
                .build();
    }
}
