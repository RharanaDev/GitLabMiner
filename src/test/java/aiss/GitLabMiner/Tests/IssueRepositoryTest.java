package aiss.GitLabMiner.Tests;

import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.models.Project;
import aiss.GitLabMiner.repositories.IssueRepository;
import aiss.GitLabMiner.repositories.ProjectRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class IssueRepositoryTest {
    private IssueRepository issueRepository;

    IssueRepositoryTest(){
        this.issueRepository =  new IssueRepository();
    }

    @Test
    @DisplayName("GitLab Fetch Issues")
    void fetchGitLab() {
        Issue[] issues = issueRepository.fetchGitLab("3472737", "20", "2");
        for(Issue i: issues){
            System.out.println(i);
        }
    }

    @Test
    @DisplayName("GitLab Big Fetch Issues")
    void bigFetchGitLab() {
        Issue[] issues = issueRepository.fetchGitLab("3472737", "50", "6");
        for(Issue i: issues){
            System.out.println(i);
        }
    }
}