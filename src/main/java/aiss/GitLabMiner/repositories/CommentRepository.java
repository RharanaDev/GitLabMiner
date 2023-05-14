package aiss.GitLabMiner.repositories;

import aiss.GitLabMiner.models.Comment;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CommentRepository{
    public final String API_TOKEN = "glpat-UByBki6qeqekMyVbkpCx";
    public final String API_URL = "https://gitlab.com/api/v4/projects/";

    //Gets issue's requested Comments from GitLab API
    public Comment[] fetchGitLab(String projectId, String issueId, String maxPages) {

        //Sets up headers and authorization
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + API_TOKEN);

        //List initialization to save commits from all pages
        List<Comment> allPagesComments = new ArrayList<>();

        //Loop that iterates through pages until maxPages is reach
        for(Integer i = 1; i <= Integer.parseInt(maxPages); i++)
        {
            //Setting the GET comments GitLab API Call for each page
            String url = API_URL + projectId + "/issues/" + issueId + "/notes?page=" + i.toString();

            //Normal single-page GET and saving into entity
            HttpEntity<String> entity = new HttpEntity<String>(url,headers);
            ResponseEntity<Comment[]> comments = restTemplate.exchange(url, HttpMethod.GET, entity, Comment[].class);

            //Getting body from entity and transforming to list
            List<Comment> pageComments = Arrays.stream(comments.getBody()).toList();

            //Saving each page content into result List
            allPagesComments.addAll(pageComments);
        }
        //List to array conversion
        return allPagesComments.toArray(new Comment[allPagesComments.size()]);
    }

}
