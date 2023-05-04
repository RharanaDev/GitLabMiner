package aiss.GitLabMiner.Tests;

import aiss.GitLabMiner.Models.Comment;
import aiss.GitLabMiner.Models.Commit;
import aiss.GitLabMiner.Services.CommitsService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommitsServiceTest {
    @Autowired
    CommitsService service;

    @Test
    @DisplayName("Get Commits")
    void findComments() {
        Commit[] commits = service.findCommits();
        for(Commit i: commits)
        {
            System.out.println(i);
        }
    }
}