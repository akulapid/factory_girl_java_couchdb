package factory;

public class Bar_GeneratedFactoryProxy extends domain.Bar {

    private factory.AbstractPersistenceHandler persistenceHandler;

    public Bar_GeneratedFactoryProxy(factory.AbstractPersistenceHandler persistenceHandler) {
        this.persistenceHandler = persistenceHandler;
    }

    public Bar_GeneratedFactoryProxy baz(java.lang.String baz) {
        setBaz(baz);
        return this;
    }

    public Bar_GeneratedFactoryProxy type(java.lang.String type) {
        setType(type);
        return this;
    }

    public domain.Bar build() {
        return (domain.Bar) this;
    }

    public domain.Bar create() {
        domain.Bar object = build();
        if (persistenceHandler == null)
            throw new factory.PersistenceHandlerMissingException("No persistence handlers found.");
        persistenceHandler.built(object);
        return object;
    }
}

@factory.__SetupForProxy(Bar_GeneratedFactoryProxy.class)
class Bar_GeneratedFactoryProxy_Setup {
}
