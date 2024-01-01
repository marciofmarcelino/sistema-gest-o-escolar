package com.systemmanager.demo.entities.classes;

import com.systemmanager.demo.entities.courses.Courses;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
public class Classes {

    @Id
    private Long id;
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
