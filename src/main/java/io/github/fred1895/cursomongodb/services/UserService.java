package io.github.fred1895.cursomongodb.services;

import io.github.fred1895.cursomongodb.domain.User;
import io.github.fred1895.cursomongodb.exception.ObjectNotFoundException;
import io.github.fred1895.cursomongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
