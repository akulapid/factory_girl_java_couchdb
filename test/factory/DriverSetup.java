package factory;

import domain.Driver;
import domain.License;
import domain.Tag;

@Setup(Driver.class)
@Persistent(databaseName = "factory-persistence-test")
class DriverSetup {

    public String name() {
        return "Schumacher";
    }

    @Associate
    public String dlNumber(License license) {
        return license.getDlNumber();
    }
}

@Setup(License.class)
@Persistent(databaseName = "factory-persistence-test")
class LicenseSetup {

    public String dlNumber() {
        return "333";
    }

    public String country() {
        return "Germany";
    }

    @Associate
    public String tagId(Tag tag) {
        return tag.getId();
    }
}

@Setup(Tag.class)
@Persistent(databaseName = "factory-persistence-test")
class TagSetup {

    public String id() {
        return "tag_id";
    }
}
