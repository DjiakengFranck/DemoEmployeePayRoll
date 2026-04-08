package za.ac.cput.repository.identity;

import za.ac.cput.entity.identity.Identity;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IIdentityRepository extends IRepository <Identity, String> {
    List<Identity>getAllIdentities();
    List<Identity>getTheIdentitiesTypes(String identityType);
}
