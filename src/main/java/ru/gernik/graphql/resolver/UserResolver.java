package ru.gernik.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.AllArgsConstructor;
import ru.gernik.graphql.dao.User;
import ru.gernik.graphql.dao.UserDao;

import java.util.Optional;

@AllArgsConstructor
public class UserResolver implements GraphQLResolver<User> {

    private UserDao userDao;

    public Optional<User> getUser(User user) {
        return userDao.getUserById(user.getId());
    }
}
