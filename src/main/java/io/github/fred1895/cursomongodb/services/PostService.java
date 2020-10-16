package io.github.fred1895.cursomongodb.services;

import io.github.fred1895.cursomongodb.domain.Post;
import io.github.fred1895.cursomongodb.exception.ObjectNotFoundException;
import io.github.fred1895.cursomongodb.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public List<Post> findAll() {
        return repository.findAll();
    }

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitleContainingIgnoreCase(text);
    }

}
