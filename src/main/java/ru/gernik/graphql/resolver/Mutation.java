package ru.gernik.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import ru.gernik.graphql.repository.CarRepository;
import ru.gernik.graphql.repository.UserRepository;
import ru.gernik.graphql.repository.model.User;

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

    public User updateUser(String id, String lastName, String name, String middleName) {
        User user = userRepository.findUserById(id).orElseThrow(RuntimeException::new);
        userRepository.save(user.setLastname(lastName)
                .setName(name)
                .setMiddlename(middleName));
        return user;
    }

    public boolean deleteUser(String id) {
        userRepository.delete(id);
        return true;
    }


}
