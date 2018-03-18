package ru.gernik.graphql.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gernik.graphql.dao.User;
import ru.gernik.graphql.dao.UserDao;
import ru.gernik.graphql.mutation.UserMutation;
import ru.gernik.graphql.query.Query;
import ru.gernik.graphql.resolver.UserResolver;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class GraphqlConfiguration {

    @Bean
    public UserDao userDao(){
        List<User> users = new ArrayList<>();
        for (int userId = 0; userId < 10; ++userId) {
            users.add(User.builder()
                    .id(String.valueOf(userId))
                    .name("name " + userId)
                    .lastname("lastname " + userId)
                    .build());

        }
        return new UserDao(users);
    }

    @Bean
    public UserResolver userResolver(UserDao userDao) {
        return  new UserResolver(userDao);
    }

    @Bean
    public Query query(UserDao userDao) {
        return  new Query(userDao);
    }

    @Bean
    public UserMutation userMutation(UserDao userDao) {
        return new UserMutation(userDao);
    }
}
