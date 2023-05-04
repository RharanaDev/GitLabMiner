
package aiss.GitLabMiner.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("iid")
    public Integer iid;
    @JsonProperty("project_id")
    public Integer projectId;
    @JsonProperty("title")
    public String title;
    @JsonProperty("description")
    public String description;
    @JsonProperty("state")
    public String state;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("closed_at")
    public String closedAt;
    @JsonProperty("labels")
    public List<String> labels;
    @JsonProperty("assignees")
    public List<User> assignees;
    @JsonProperty("author")
    public User author;
    @JsonProperty("upvotes")
    public Integer upvotes;
    @JsonProperty("downvotes")
    public Integer downvotes;

    public Issue(Integer id, Integer iid, Integer projectId, String title, String description, String state, String createdAt, String updatedAt, String closedAt, List<String> labels, List<User> assignees, User author, Integer upvotes, Integer downvotes) {
        this.id = id;
        this.iid = iid;
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.labels = labels;
        this.assignees = assignees;
        this.author = author;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id=" + id +
                ", iid=" + iid +
                ", projectId=" + projectId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", state='" + state + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", closedAt='" + closedAt + '\'' +
                ", labels=" + labels +
                ", assignees=" + assignees +
                ", author=" + author +
                ", upvotes=" + upvotes +
                ", downvotes=" + downvotes +
                '}';
    }
}
