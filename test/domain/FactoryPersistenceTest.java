package domain;

import org.junit.Test;

import static akula.factory.Factories.newFoo;

public class FactoryPersistenceTest {

    @Test
    public void shouldPersistFooInCouchdb() {
        newFoo().setFu(25).create();
    }
}
