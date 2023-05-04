
package aiss.GitLabMiner.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("web_url")
    public String webUrl;

    public Project(Integer id, String name, String webUrl) {
        this.id = id;
        this.name = name;
        this.webUrl = webUrl;
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
