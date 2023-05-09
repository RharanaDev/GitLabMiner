package aiss.GitLabMiner.controllers;

import aiss.GitLabMiner.models.Project;
import aiss.GitLabMiner.repositories.ProjectRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")

public class ProjectController {

    private final ProjectRepository repository;

    public ProjectController(ProjectRepository repository) {
        this.repository = repository;
    }

    // GET http:///localhost:8080/api/project
    @GetMapping("/{id}")
    public Project findProject(@PathVariable String id){
        return repository.fetchGitLab(id);
    }

    // GET http://localhost:8080/api/projects/{id}

/*    @GetMapping("/{id}")
    public Project findOne(@PathVariable String id){
        return repository.findOne(id);
    }*/


    // POST http://localhost:8080/api/projects
    /*@ResponseStatus(HttpStatus.CREATED)*/
/*    @PostMapping
    public Project create(@Valid @RequestBody Project project) { return repository.create(); }*/

}
