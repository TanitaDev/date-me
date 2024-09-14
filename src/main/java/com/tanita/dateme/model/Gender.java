package com.tanita.dateme.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Set;

@Entity
@Table(name = "gender")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gender extends AbstractEntity {

    private String name;

    @OneToMany(mappedBy = "gender")
    private Set<User> users;

}