package io.github.fred1895.cursomongodb.repositories;

import io.github.fred1895.cursomongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
