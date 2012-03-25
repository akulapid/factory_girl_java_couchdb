package domain;

import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

public class License extends CouchDbDocument {

    @TypeDiscriminator
    @JsonProperty
    private String type = "License";

    @JsonProperty
    private String country;
    @JsonProperty
    private String tagId;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }
}
