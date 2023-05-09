package aiss.GitLabMiner.controllers;

import aiss.GitLabMiner.models.Comment;
import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.repositories.CommentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*@RestController
@RequestMapping("/api/comments")*/
public class CommentController {
/*
    private final CommentRepository repository;

    public CommentController(CommentRepository repository) {
        this.repository = repository;
    }

    // GET http:///localhost:8080/api/comments
    @GetMapping
    public List<Comment> findAll(){
        return repository.findAll();
    }

    // GET http://localhost:8080/api/comments/{id}
    @GetMapping("/{id}")
    public Comment findOne(@PathVariable String id){
        return repository.findOne(id);
    }

    // GET http://localhost:8080/api/comments/{issue}
    @GetMapping("/{issue}")
    public List<Comment> getIssuesComments(@PathVariable Issue issue){
        return repository.getIssuesComments(issue);
    }*/


}
