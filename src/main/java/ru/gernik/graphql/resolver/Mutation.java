package ru.gernik.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.gernik.graphql.model.User;
import ru.gernik.graphql.dao.UserDao;
import ru.gernik.graphql.repository.CarRepository;
import ru.gernik.graphql.repository.UserRepository;

import java.util.UUID;

@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private final UserRepository userRepository;
    private final CarRepository carRepository;

    public User saveUser(String name, String lastName, String middleName) {
        User user = new User().setName(name)
                .setLastname(lastName)
                .setMiddlename(middleName);
        userRepository.save(user);
        return user;
    }

    public User updateUser(User updUser) {
        userRepository.save(updUser);
        return updUser;
    }

    public void deleteUser(String id) {
        userRepository.delete(id);
    }


}
