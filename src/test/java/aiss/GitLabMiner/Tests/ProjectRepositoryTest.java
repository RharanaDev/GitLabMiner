package aiss.GitLabMiner.Tests;

import aiss.GitLabMiner.models.Project;
import aiss.GitLabMiner.repositories.ProjectRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ProjectRepositoryTest {
    private ProjectRepository projectRepository;
    ProjectRepositoryTest(){
        this.projectRepository =  new ProjectRepository();
    }
    @Test
    @DisplayName("GitLab Fetch Project")
    void fetchGitLab() {
        Project project = projectRepository.fetchGitLab("3472737");
        System.out.println(project);
    }

}