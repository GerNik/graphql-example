package ru.gernik.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.gernik.graphql.model.User;
import ru.gernik.graphql.dao.UserDao;
import ru.gernik.graphql.repository.UserRepository;
@AllArgsConstructor
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private UserRepository userRepository;

    public User getUser(String id){
        return  userRepository.findUserById(id).orElseThrow(RuntimeException::new);
    }
}
