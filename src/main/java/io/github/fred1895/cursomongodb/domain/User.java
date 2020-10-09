package io.github.fred1895.cursomongodb.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User implements Serializable {
    private Long id;
    private String name;
    private String email;
}
