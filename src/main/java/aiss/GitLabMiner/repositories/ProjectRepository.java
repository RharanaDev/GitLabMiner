package aiss.GitLabMiner.repositories;

import aiss.GitLabMiner.models.Project;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ProjectRepository{
    public final String API_TOKEN = "glpat-UByBki6qeqekMyVbkpCx";
    public final String API_URL = "https://gitlab.com/api/v4/projects/";

    public final String API_POST_URL = "http://localhost:8080/gitminer/projects";

    //Gets requested Project from GitLab API
    public Project fetchGitLab(String id) {
        //Sets up headers and authorization
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + API_TOKEN);

        //Setting the GET project GitLab API Call
        String url = API_URL + id;
        HttpEntity<String> entity = new HttpEntity<String>(url,headers);

        //GET and saving into entity
        ResponseEntity<Project> project = restTemplate.exchange(url, HttpMethod.GET, entity, Project.class);

        //Getting response body
        return project.getBody();
    }

    //From controller, this function is called as soon as project object has been modified to
    //contain all issues, commits, comments and users implied.
    //POST the object to GitLab API on 8080 port
    public void postGitMiner(Project project) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_POST_URL;
        restTemplate.postForObject(url, project, Project.class);
    }
}
