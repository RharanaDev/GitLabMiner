package aiss.GitLabMiner.controllers;

import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.repositories.IssueRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueController {

    private final IssueRepository repository;

    public IssueController(IssueRepository repository) {
        this.repository = repository;
    }

    // GET http:///localhost:8080/api/issues
    @GetMapping
    public List<Issue> findAll(){
        return repository.findAll();
    }

    // GET http://localhost:8080/api/issues/{id}
    @GetMapping("/{id}")
    public Issue findOne(@PathVariable String id){
        return repository.findOne(id);
    }

    // GET http://localhost:8080/api/issues/{authorId}
    @GetMapping("/{authorId}")
    public List<Issue> findAllIssuesByAuthorId(@PathVariable String authorId){
        return repository.findAllIssuesByAuthorId(authorId);
    }

    // GET http://localhost:8080/api/issues/{state}
    @GetMapping("/{authorId}")
    public List<Issue> findAllIssuesByState(@PathVariable String state){
        return repository.findAllIssuesByState(state);
    }


}
