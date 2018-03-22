package ru.gernik.graphql.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gernik.graphql.repository.model.Car;

public interface CarRepository extends PagingAndSortingRepository<Car, String> {
}
