
package aiss.GitLabMiner.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("username")
    public String username;
    @JsonProperty("name")
    public String name;
    @JsonProperty("avatar_url")
    public String avatarUrl;
    @JsonProperty("web_url")
    public String webUrl;

    public User(Integer id, String username, String name, String avatarUrl, String webUrl) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.webUrl = webUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", webUrl='" + webUrl + '\'' +
                '}';
    }

}
