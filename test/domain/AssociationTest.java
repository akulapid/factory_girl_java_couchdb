package domain;

import org.junit.Test;

import static akula.factory.Factories.newDriver;

public class AssociationTest {

    @Test
    public void shouldPersistAssociations() {
        newDriver().create();
    }
}
