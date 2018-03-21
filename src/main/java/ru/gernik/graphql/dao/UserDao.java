package ru.gernik.graphql.dao;

import lombok.AllArgsConstructor;
import ru.gernik.graphql.model.User;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class UserDao {
    private List<User> users;

    public Optional<User> getUserById(String id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    public void saveUser(User user) {
        users.add(user);
    }
}
