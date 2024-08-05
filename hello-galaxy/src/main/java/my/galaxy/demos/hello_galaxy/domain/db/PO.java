package my.galaxy.demos.hello_galaxy.domain.db;

import com.linkgie.galaxyframework.persistence.mongodb.MongoPO;


public class PO extends MongoPO {


    private String alias;

    private String url;


    private String description;


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
