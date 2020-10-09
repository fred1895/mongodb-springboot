package io.github.fred1895.cursomongodb.services;

import io.github.fred1895.cursomongodb.domain.User;
import io.github.fred1895.cursomongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

}
