package akula.factory;

import org.apache.http.HttpHost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@PersistenceHandler
public class CouchdbPersistenceHandler extends AbstractPersistenceHandler {

    private StdCouchDbConnector couchDbConnector;

    public CouchdbPersistenceHandler(String databaseName) {
        super(databaseName);
//        ApplicationContext context = new ClassPathXmlApplicationContext("factoryGirlCouchdbContext.xml");
//        CouchDbInstance couchDbInstance = (CouchDbInstance) context.getBean("couchDbInstance");
        BasicHttpParams params = new BasicHttpParams();
        params.setParameter(ClientPNames.DEFAULT_HOST, new HttpHost("localhost", 5984, "http"));
        HttpClient httpClient = new StdHttpClient(new DefaultHttpClient(params));
        CouchDbInstance couchDbInstance = new StdCouchDbInstance(httpClient);
        couchDbConnector = new StdCouchDbConnector(databaseName, couchDbInstance);
        couchDbConnector.createDatabaseIfNotExists();
    }

    @Override
    public void persist(Object object) {
        couchDbConnector.create(object);
    }
}