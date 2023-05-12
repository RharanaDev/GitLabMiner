
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
    @JsonProperty("issues")
    public Issue[] issues;
    @JsonProperty("commits")
    public Commit[] commits;

    public Project() {}

    public Project(String id, String name, String webUrl) {
        this.id = id;
        this.name = name;
        this.webUrl = webUrl;
    }

    public void setIssues(Issue[] issues) {
        this.issues = issues;
    }

    public void setCommits(Commit[] commits) {
        this.commits = commits;
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
