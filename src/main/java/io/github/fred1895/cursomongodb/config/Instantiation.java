package io.github.fred1895.cursomongodb.config;

import io.github.fred1895.cursomongodb.domain.Post;
import io.github.fred1895.cursomongodb.domain.User;
import io.github.fred1895.cursomongodb.dto.AuthorDTO;
import io.github.fred1895.cursomongodb.repositories.PostRepository;
import io.github.fred1895.cursomongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post = new Post(null, dateFormat.parse("20/10/2020"), "Partiu viagem", "A viagem vai ser muito boa", new AuthorDTO(maria));
        Post post2 = new Post(null, dateFormat.parse("21/10/2020"), "Partiu estudo", "O estudo vai ser muito bom", new AuthorDTO(bob));
        postRepository.saveAll(Arrays.asList(post, post2));

        maria.getPosts().addAll(Arrays.asList(post, post2));
        userRepository.save(maria);

    }
}
