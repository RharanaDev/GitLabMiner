package aiss.GitLabMiner.Tests;

import aiss.GitLabMiner.models.Issue;
import aiss.GitLabMiner.services.IssuesService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IssuesServiceTest {
    @Autowired
    IssuesService service;

    @Test
    @DisplayName("Get Issues")
    void findIssues() {
        Issue[] issues = service.findIssues();
        for(Issue i: issues)
        {
            System.out.println(i);
        }
    }
}