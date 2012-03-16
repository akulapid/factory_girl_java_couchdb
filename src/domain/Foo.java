package domain;

import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

public class Foo extends CouchDbDocument {

    @TypeDiscriminator
    String type = "Foo";

    @JsonProperty
    private int fu;

    @JsonProperty
    private String barId;

    public void setFu(int fu) {
        this.fu = fu;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
