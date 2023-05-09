
package aiss.GitLabMiner.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("web_url")
    public String webUrl;

    public Project() {}

    public Project(String id, String name, String webUrl) {
        this.id = id;
        this.name = name;
        this.webUrl = webUrl;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWebUrl() {
        return webUrl;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", webUrl='" + webUrl + '\'' +
                '}';
    }
}
