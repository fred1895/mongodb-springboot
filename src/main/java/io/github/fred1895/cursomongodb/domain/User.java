package io.github.fred1895.cursomongodb.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Document
public class User implements Serializable {
    @Id
    private String id;
    private String name;
    private String email;
}
