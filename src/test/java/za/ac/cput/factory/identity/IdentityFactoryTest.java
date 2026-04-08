package za.ac.cput.factory.identity;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.identity.Identity;

import static org.junit.jupiter.api.Assertions.*;

class IdentityFactoryTest {

    public Identity identity = IdentityFactory.createIdentity(" ",
                                                              " ");

    @Test
    void createIdentity() {
        System.out.println(identity);

    }
}