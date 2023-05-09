package aiss.GitLabMiner.repositories;

import aiss.GitLabMiner.models.Comment;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CommentRepository {
    public final String API_TOKEN = "glpat-UByBki6qeqekMyVbkpCx";
    public final String API_URL = "https://gitlab.com/api/v4/projects/";
    public Comment[] fetchGitLab(String projectId, String issueId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + API_TOKEN);
        String url = API_URL + projectId + "/issues/" + issueId + "/notes";
        HttpEntity<String> entity = new HttpEntity<String>(url,headers);
        ResponseEntity<Comment[]> comments = restTemplate.exchange(url, HttpMethod.GET, entity, Comment[].class);
        return comments.getBody();
    }

}
