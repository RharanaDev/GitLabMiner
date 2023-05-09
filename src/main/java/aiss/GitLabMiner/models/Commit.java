
package aiss.GitLabMiner.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Commit {

    @JsonProperty("id")
    public String id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("message")
    public String message;
    @JsonProperty("author_name")
    public String authorName;
    @JsonProperty("author_email")
    public String authorEmail;
    @JsonProperty("authored_date")
    public String authoredDate;
    @JsonProperty("committer_name")
    public String committerName;
    @JsonProperty("committer_email")
    public String committerEmail;
    @JsonProperty("committed_date")
    public String committedDate;
    @JsonProperty("web_url")
    public String webUrl;

    public Commit(String id, String title, String message, String authorName, String authorEmail, String authoredDate, String committerName, String committerEmail, String committedDate, String webUrl) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.authoredDate = authoredDate;
        this.committerName = committerName;
        this.committerEmail = committerEmail;
        this.committedDate = committedDate;
        this.webUrl = webUrl;
    }

    public Commit(){}

    @Override
    public String toString() {
        return "Commit{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorEmail='" + authorEmail + '\'' +
                ", authoredDate='" + authoredDate + '\'' +
                ", committerName='" + committerName + '\'' +
                ", committerEmail='" + committerEmail + '\'' +
                ", committedDate='" + committedDate + '\'' +
                ", webUrl='" + webUrl + '\'' +
                '}';
    }
}
