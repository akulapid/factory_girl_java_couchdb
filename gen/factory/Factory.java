package factory;

public class Factory {

    public static factory.Foo_GeneratedFactoryProxy newFoo() {
        return factory.Instantiator.createProxy(Foo_GeneratedFactoryProxy.class, "");
    }

    public static factory.Bar_GeneratedFactoryProxy newBar() {
        return factory.Instantiator.createProxy(Bar_GeneratedFactoryProxy.class, "");
    }

}