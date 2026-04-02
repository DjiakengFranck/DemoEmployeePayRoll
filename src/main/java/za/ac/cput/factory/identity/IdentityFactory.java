package za.ac.cput.factory.identity;

import util.Helper;
import za.ac.cput.entity.identity.Identity;

public class IdentityFactory {
    public static Identity createIdentity(String identityType,
                                          String description){
        if (Helper.isEmptyOrNull(identityType) ||
            Helper.isEmptyOrNull(description)){
            return null;
        }
        return new Identity.Builder()
                .setIdentityType(identityType)
                .setDescription(description)
                .build();

    }
}
