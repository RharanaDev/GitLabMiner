package aiss.GitLabMiner.repositories;

import aiss.GitLabMiner.models.Project;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ProjectRepository{
    public final String API_TOKEN = "glpat-UByBki6qeqekMyVbkpCx";
    public final String API_URL = "https://gitlab.com/api/v4/projects/";
    public Project fetchGitLab(String id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + API_TOKEN);
        String url = API_URL + id;
        HttpEntity<String> entity = new HttpEntity<String>(url,headers);
        ResponseEntity<Project> project = restTemplate.exchange(url, HttpMethod.GET, entity, Project.class);
        return project.getBody();
    }
}
