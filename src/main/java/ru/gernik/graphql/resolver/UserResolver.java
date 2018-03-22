package ru.gernik.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.AllArgsConstructor;
import ru.gernik.graphql.repository.UserRepository;
import ru.gernik.graphql.repository.model.User;

import java.util.Optional;

@AllArgsConstructor
public class UserResolver implements GraphQLResolver<User> {

    private UserRepository userRepository;

    public Optional<User> getUser(User user) {
        return userRepository.findUserById(user.getId());
    }
}
