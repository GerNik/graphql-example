package ru.gernik.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import ru.gernik.graphql.dao.User;
import ru.gernik.graphql.dao.UserDao;

@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    private UserDao userDao;

    public User getUserById(String id){
        return  userDao.getUserById(id).orElseThrow(RuntimeException::new);
    }
}
