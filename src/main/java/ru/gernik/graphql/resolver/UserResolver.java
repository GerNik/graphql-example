package ru.gernik.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.AllArgsConstructor;
import ru.gernik.graphql.model.User;
import ru.gernik.graphql.dao.UserDao;
import ru.gernik.graphql.repository.UserRepository;

import java.util.Optional;

@AllArgsConstructor
public class UserResolver implements GraphQLResolver<User> {

    private UserRepository userRepository;

    public Optional<User> getUser(User user) {
        return userRepository.findUserById(user.getId());
    }
}
