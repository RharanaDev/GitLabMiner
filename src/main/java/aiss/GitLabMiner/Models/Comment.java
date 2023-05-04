
package aiss.GitLabMiner.Models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("body")
    public String body;
    @JsonProperty("author")
    public User author;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;

    public Comment(Integer id, String body, User author, String createdAt, String updatedAt) {
        this.id = id;
        this.body = body;
        this.author = author;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", author=" + author +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
