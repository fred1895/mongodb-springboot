package io.github.fred1895.cursomongodb.resources;

import io.github.fred1895.cursomongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User user1 = new User();
        user1.setId(1L);
        user1.setName("Fred");
        user1.setEmail("fred@gmail.com");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Maria");
        user2.setEmail("maria@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(user1, user2));
        return ResponseEntity.ok().body(list);
    }
}
