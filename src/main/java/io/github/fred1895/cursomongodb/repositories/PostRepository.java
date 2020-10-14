package io.github.fred1895.cursomongodb.repositories;

import io.github.fred1895.cursomongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
