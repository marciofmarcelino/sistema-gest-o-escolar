package com.systemmanager.demo.entities.classes;

import com.systemmanager.demo.entities.courses.Courses;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "o nome deve ser informado")
    @Size(min=3, message = "o nome deve ter no minimo 3 caracteres")
    private String name;

    @ManyToMany(mappedBy = "classes") // "classes" é o nome do atributo em Courses
    private List<Courses> courses;

    public Classes() {
    }

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
}
