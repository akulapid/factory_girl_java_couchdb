package domain;

import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

public class Tag extends CouchDbDocument {
    @TypeDiscriminator
    @JsonProperty
    private String type = "Tag";
}
