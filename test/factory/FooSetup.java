package factory;

import domain.Bar;
import domain.Foo;

@Setup(Foo.class)
@Persistent(databaseName = "factory-persistence-test")
class FooSetup {

    public int fu() {
        return 5;
    }

    public String barId() {
        return "bar";
    }
}

@Setup(Bar.class)
@Persistent(databaseName = "factory-persistence-test")
class BarSetup {

    public String baz() {
        return "baz";
    }
}
