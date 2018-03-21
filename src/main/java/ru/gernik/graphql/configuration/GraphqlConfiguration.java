package ru.gernik.graphql.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gernik.graphql.repository.CarRepository;
import ru.gernik.graphql.repository.UserRepository;
import ru.gernik.graphql.resolver.Mutation;
import ru.gernik.graphql.resolver.Query;
import ru.gernik.graphql.resolver.UserResolver;

@Configuration
public class GraphqlConfiguration {

    @Bean
    public UserResolver userResolver(UserRepository userRepository) {
        return new UserResolver(userRepository);
    }

    @Bean
    public Query query(UserRepository userRepository) {
        return new Query(userRepository);
    }

    @Bean
    public Mutation mutation(UserRepository userRepository, CarRepository carRepository) {
        return new Mutation(userRepository, carRepository);
    }
}
