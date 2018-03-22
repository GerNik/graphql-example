package ru.gernik.graphql.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.gernik.graphql.repository.UserRepository;
import ru.gernik.graphql.repository.model.User;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id")  String id) {
        return userRepository.findUserById(id).orElseThrow(RuntimeException::new);
    }
}
