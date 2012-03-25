package akula.factory;

import domain.Driver;
import domain.License;
import domain.Tag;

@Factory(Driver.class)
@Persistent(databaseName = "factory-persistence-test")
class DriverSetup {

    public String name() {
        return "Schumacher";
    }

    public String licenseId(License license) {
        return license.getId();
    }
}

@Factory(License.class)
@Persistent(databaseName = "factory-persistence-test")
class LicenseSetup {

    public String id() {
        return "license_id";
    }

    public String country() {
        return "Germany";
    }

    public String tagId(Tag tag) {
        return tag.getId();
    }
}

@Factory(Tag.class)
@Persistent(databaseName = "factory-persistence-test")
class TagSetup {

    public String id() {
        return "tag_id";
    }
}
