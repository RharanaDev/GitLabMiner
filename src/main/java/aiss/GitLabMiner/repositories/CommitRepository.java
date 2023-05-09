package aiss.GitLabMiner.repositories;

import aiss.GitLabMiner.models.Commit;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CommitRepository {
    public final String API_TOKEN = "glpat-UByBki6qeqekMyVbkpCx";
    public final String API_URL = "https://gitlab.com/api/v4/projects/";
    public Commit[] fetchGitLab(String id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + API_TOKEN);
        String url = API_URL + id + "/repository/commits";
        HttpEntity<String> entity = new HttpEntity<String>(url,headers);
        ResponseEntity<Commit[]> project = restTemplate.exchange(url, HttpMethod.GET, entity, Commit[].class);
        return project.getBody();
    }
}
