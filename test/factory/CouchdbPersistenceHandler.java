package factory;

import org.ektorp.CouchDbInstance;
import org.ektorp.impl.StdCouchDbConnector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@PersistenceHandler
public class CouchdbPersistenceHandler extends AbstractPersistenceHandler {

    private StdCouchDbConnector couchDbConnector;

    public CouchdbPersistenceHandler(String databaseName) {
        super(databaseName);
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryGirlCouchdbContext.xml");
        CouchDbInstance couchDbInstance = (CouchDbInstance) context.getBean("couchDbInstance");
        couchDbConnector = new StdCouchDbConnector(databaseName, couchDbInstance);
        couchDbConnector.createDatabaseIfNotExists();
    }

    public void built(Object object) {
        couchDbConnector.create(object);
    }
}