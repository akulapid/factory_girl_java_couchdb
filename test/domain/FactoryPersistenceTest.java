package domain;

import factory.Factory;
import org.junit.Test;

public class FactoryPersistenceTest {

    @Test
    public void shouldPersistFooInCouchdb() {
        Factory.newFoo().fu(25).create();
    }
}
