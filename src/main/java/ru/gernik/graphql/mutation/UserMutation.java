package ru.gernik.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import ru.gernik.graphql.dao.User;
import ru.gernik.graphql.dao.UserDao;

import java.util.UUID;

@AllArgsConstructor
public class UserMutation implements GraphQLMutationResolver {

    private UserDao userDao;

    public User saveUser(String name, String lastName, String middleName) {
        User user = User.builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .lastname(lastName)
                .middlename(middleName)
                .build();
        return user;
    }
}
