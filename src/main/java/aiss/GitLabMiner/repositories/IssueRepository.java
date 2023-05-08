package aiss.GitLabMiner.repositories;

import aiss.GitLabMiner.models.Issue;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class IssueRepository {

    List<Issue> issues = new ArrayList<>();

    public IssueRepository(){

    }

    public List<Issue> findAll(){ return issues; }

    public Issue findOne(String id){
        return issues.stream()
                .filter(issue -> issue.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Issue> findAllIssuesByAuthorId(String authorId){
        return issues.stream()
                .filter(issue -> issue.getAuthor().getId().equals(authorId))
                .collect(Collectors.toList());
    }

    public List<Issue> findAllIssuesByState(String state){
        return issues.stream()
                .filter(issue -> issue.getState().equals(state))
                .collect(Collectors.toList());
    }
}
