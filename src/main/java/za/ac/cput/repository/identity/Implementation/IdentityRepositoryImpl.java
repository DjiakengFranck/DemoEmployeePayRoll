package za.ac.cput.repository.identity.Implementation;

import za.ac.cput.entity.identity.Identity;
import za.ac.cput.repository.identity.IIdentityRepository;

import java.util.ArrayList;
import java.util.List;

public class IdentityRepositoryImpl implements IIdentityRepository {

    public List<Identity>identityList;

    private IdentityRepositoryImpl() {
        identityList = new ArrayList<>();
    }

    public static IIdentityRepository identityRepository= null;

    private static IIdentityRepository getInstance(){
        if (identityRepository == null){
            identityRepository = new IdentityRepositoryImpl();
        }
        return identityRepository;
    }

    @Override
    public Identity create(Identity identity) {
        identityList.add(identity);
        return identity;
    }

    @Override
    public Identity read(String string) {
        for (Identity identity : identityList){
            if (identity.getIdentityType().equalsIgnoreCase(string)){
                return identity;
            }
        }
        return null;
    }

    @Override
    public Identity update(Identity identity) {
        Identity oldIdentity = read(identity.getIdentityType());
        if (oldIdentity != null){
            identityList.remove(oldIdentity);
            identityList.add(identity);
            return identity;
        }
        return null;
    }

    @Override
    public boolean delete(String string) {
        Identity identity = read(string);
        if (identity != null){
            identityList.remove(identity);
            return true;
        }
        return false;
    }

    @Override
    public List<Identity> getAllIdentities() {
        return identityList;
    }

    @Override
    public List<Identity> getTheIdentitiesTypes(String identityType) {
        List<Identity>results = new ArrayList<>();
        for (Identity identity : identityList){
            if (identity.getIdentityType().equalsIgnoreCase(identityType)){
                results.add(identity);
            }
        }
        return results;
    }
}
