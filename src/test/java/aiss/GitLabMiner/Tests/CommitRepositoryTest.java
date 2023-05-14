package aiss.GitLabMiner.Tests;

import aiss.GitLabMiner.models.Commit;
import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.repositories.CommitRepository;
import aiss.GitLabMiner.repositories.IssueRepository;
import aiss.GitLabMiner.repositories.ProjectRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CommitRepositoryTest {

    private CommitRepository commitRepository;

    CommitRepositoryTest(){
        this.commitRepository =  new CommitRepository();
    }

    @Test
    @DisplayName("GitLab Fetch Commits")
    void fetchGitLab() {
        Commit[] commits = commitRepository.fetchGitLab("3472737", "2", "2");
        for(Commit co: commits){
            System.out.println(co);
        }
    }

    @Test
    @DisplayName("GitLab Big Fetch Commits")
    void bigFetchGitLab() {
        Commit[] commits = commitRepository.fetchGitLab("3472737", "30", "5");
        for(Commit co: commits){
            System.out.println(co);
        }
    }
}