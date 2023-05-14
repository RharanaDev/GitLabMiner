package aiss.GitLabMiner.Tests;

import aiss.GitLabMiner.models.Comment;
import aiss.GitLabMiner.models.Commit;
import aiss.GitLabMiner.repositories.CommentRepository;
import aiss.GitLabMiner.repositories.CommitRepository;
import aiss.GitLabMiner.repositories.ProjectRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryTest {

    private CommentRepository commentRepository;

    CommentRepositoryTest(){
        this.commentRepository =  new CommentRepository();
    }

    @Test
    @DisplayName("GitLab Fetch Comments")
    void fetchGitLab() {
        Comment[] comments = commentRepository.fetchGitLab("3472737", "4280", "2");
        for(Comment c: comments){
            System.out.println(c);
        }
    }

    @Test
    @DisplayName("GitLab Big Fetch Comments")
    void bigFetchGitLab() {
        Comment[] comments = commentRepository.fetchGitLab("3472737", "4256", "4");
        for(Comment c: comments){
            System.out.println(c);
        }
    }
}