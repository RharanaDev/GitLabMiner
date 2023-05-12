package aiss.GitLabMiner.controllers;

import aiss.GitLabMiner.models.Comment;
import aiss.GitLabMiner.models.Commit;
import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.models.Project;
import aiss.GitLabMiner.repositories.CommentRepository;
import aiss.GitLabMiner.repositories.CommitRepository;
import aiss.GitLabMiner.repositories.IssueRepository;
import aiss.GitLabMiner.repositories.ProjectRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/merged")
public class MergedDataController {
    private final ProjectRepository projectRepository;
    private final CommitRepository commitRepository;
    private final IssueRepository issueRepository;
    private final CommentRepository commentRepository;

    public MergedDataController(ProjectRepository projectRepository, CommitRepository commitRepository, IssueRepository issueRepository, CommentRepository commentRepository) {
        this.projectRepository = projectRepository;
        this.commitRepository = commitRepository;
        this.issueRepository = issueRepository;
        this.commentRepository = commentRepository;
    }

    // GET http:///localhost:8080/api/project
    @PostMapping("/{id}")
    public Project fetchAllData(@PathVariable String id)
    {
        Project project = projectRepository.fetchGitLab(id);
        Commit[] commits = commitRepository.fetchGitLab(id);
        Issue[] issues = issueRepository.fetchGitLab(id);
        for(Issue i: issues){
            Comment[] comments = commentRepository.fetchGitLab(id, i.getRef_id().toString());
            i.setComments(comments);
        }
        project.setCommits(commits);
        project.setIssues(issues);
        projectRepository.postGitMiner(project);
        return project;
    }
}
 