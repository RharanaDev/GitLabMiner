package aiss.GitLabMiner.Tests;

import aiss.GitLabMiner.Models.Comment;
import aiss.GitLabMiner.Services.CommentsService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommentsServiceTest {
    @Autowired
    CommentsService service;

    @Test
    @DisplayName("Get Comments")
    void findComments() {
        Comment[] comments = service.findComments();
        for(Comment i: comments)
        {
            System.out.println(i);
        }
    }
}