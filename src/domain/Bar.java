package domain;

import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

public class Bar extends CouchDbDocument {

    @TypeDiscriminator
    String type = "Bar";

    @JsonProperty
    private String baz;

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
