package ru.gernik.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.gernik.graphql.repository.UserRepository;
import ru.gernik.graphql.repository.model.User;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private UserRepository userRepository;

    public User getUser(String id){
        return  userRepository.findUserById(id).orElseThrow(RuntimeException::new);
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().iterator().forEachRemaining(users::add);
        return users;
    }
}
