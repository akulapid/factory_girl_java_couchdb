package domain;

import factory.*;
import org.junit.Test;

import java.lang.reflect.Field;

import static junit.framework.Assert.assertNotNull;

public class AssociationTest {

    @Test
    public void shouldInstantiateProxyWithContextObject() throws NoSuchFieldException, IllegalAccessException {
        Driver_GeneratedFactoryProxy driverProxy = Factory.newDriver();
        Field context = driverProxy.getClass().getDeclaredField("objectContext");
        context.setAccessible(true);
        assertNotNull(context.get(driverProxy));
    }
}
