package factory;

public class Foo_GeneratedFactoryProxy extends domain.Foo {

    private factory.AbstractPersistenceHandler persistenceHandler;

    public Foo_GeneratedFactoryProxy(factory.AbstractPersistenceHandler persistenceHandler) {
        this.persistenceHandler = persistenceHandler;
    }

    public Foo_GeneratedFactoryProxy fu(int fu) {
        setFu(fu);
        return this;
    }

    public Foo_GeneratedFactoryProxy barId(java.lang.String barId) {
        setBarId(barId);
        return this;
    }

    public Foo_GeneratedFactoryProxy type(java.lang.String type) {
        setType(type);
        return this;
    }

    public domain.Foo build() {
        return (domain.Foo) this;
    }

    public domain.Foo create() {
        domain.Foo object = build();
        if (persistenceHandler == null)
            throw new factory.PersistenceHandlerMissingException("No persistence handlers found.");
        persistenceHandler.built(object);
        return object;
    }
}

@factory.__SetupForProxy(Foo_GeneratedFactoryProxy.class)
class Foo_GeneratedFactoryProxy_Setup {
}
