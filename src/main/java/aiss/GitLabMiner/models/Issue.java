
package aiss.GitLabMiner.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("ref_id")
    public Integer ref_id;
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
    @JsonProperty("author")
    public User author;
    @JsonProperty("assignees")
    public List<User> assignees;
    @JsonProperty("upvotes")
    public Integer upvotes;
    @JsonProperty("downvotes")
    public Integer downvotes;

    public Issue() {}

    public Issue(Integer id, Integer ref_id, String title, String description, String state, String createdAt, String updatedAt, String closedAt, List<String> labels, User author, List<User> assignees, Integer upvotes, Integer downvotes) {
        this.id = id;
        this.ref_id = ref_id;
        this.title = title;
        this.description = description;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.labels = labels;
        this.author = author;
        this.assignees = assignees;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id=" + id +
                ", ref_id=" + ref_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", state='" + state + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", closedAt='" + closedAt + '\'' +
                ", labels=" + labels +
                ", author=" + author +
                ", upvotes=" + upvotes +
                ", downvotes=" + downvotes +
                '}';
    }
}
