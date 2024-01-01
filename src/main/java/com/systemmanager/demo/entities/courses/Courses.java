package com.systemmanager.demo.entities.courses;



import com.systemmanager.demo.entities.classes.Classes;
import com.systemmanager.demo.entities.user.teacher.Teacher;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;




@Entity
public class Courses {
    @Id
    private Long id;
    private String name;
    
    @ManyToMany
    private List<Teacher> teachers;
    @ManyToMany
    private List<Classes> classes;
    public Courses(Long id, String name, List<Teacher> teachers, List<Classes> classes) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
        this.classes = classes;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public List<Classes> getClasses() {
        return classes;
    }
    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

   
    
}
    