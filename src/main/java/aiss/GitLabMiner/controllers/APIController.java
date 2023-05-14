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
@RequestMapping("/gitlabminer")
public class APIController {
    private final ProjectRepository projectRepository;
    private final CommitRepository commitRepository;
    private final IssueRepository issueRepository;
    private final CommentRepository commentRepository;

    public APIController(ProjectRepository projectRepository, CommitRepository commitRepository, IssueRepository issueRepository, CommentRepository commentRepository) {
        this.projectRepository = projectRepository;
        this.commitRepository = commitRepository;
        this.issueRepository = issueRepository;
        this.commentRepository = commentRepository;
    }

    //POST http://localhost:8081/gitlabminer/{id}?sinceCommits=X&sinceIssues=Y&maxPages=Z
    @PostMapping("/{id}")
    public Project fetchAllData(@PathVariable String id,
                                @RequestParam(defaultValue = "20") String sinceIssues,
                                @RequestParam(defaultValue = "2") String sinceCommits,
                                @RequestParam(defaultValue = "2") String maxPages)
    {
        //GET single project from GitLab API
        Project project = projectRepository.fetchGitLab(id);

        //GET all requested commits from GitLab API, fetching until maxPage Z is reach and only those created
        // since X days prior to today
        Commit[] commits = commitRepository.fetchGitLab(id, sinceCommits, maxPages);

        //GET all requested issues from GitLab API, fetching until maxPage Z is reach and only those updated
        // since Y days prior to today
        Issue[] issues = issueRepository.fetchGitLab(id, sinceIssues, maxPages);

        //GET comments on each issue fetched right before, and setting them as a property of father issue
        for(Issue i: issues){
            Comment[] comments = commentRepository.fetchGitLab(id, i.getRef_id().toString(), maxPages);
            i.setComments(comments);
        }

        //Sets up final project object, ready to be posted on API
        project.setCommits(commits);
        project.setIssues(issues);

        //Posts project to GitMiner API, hosted in 8080 port
        projectRepository.postGitMiner(project);

        //Object sent will be the content of HTTP response
        return project;
    }
}
 