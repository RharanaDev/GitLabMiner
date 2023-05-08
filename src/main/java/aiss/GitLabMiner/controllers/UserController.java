package aiss.GitLabMiner.controllers;

import aiss.GitLabMiner.repositories.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

        private UserRepository repository;

        public UserController(UserRepository repository) {
            this.repository = repository;
        }

}
