package ru.gernik.graphql.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gernik.graphql.model.User;

import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<User, String> {
    Optional<User> findUserById(String id);
}
