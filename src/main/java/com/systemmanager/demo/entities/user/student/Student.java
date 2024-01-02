package com.systemmanager.demo.entities.user.student;

import com.systemmanager.demo.entities.classes.Classes;
import com.systemmanager.demo.entities.courses.Courses;
import com.systemmanager.demo.entities.user.User;
import com.systemmanager.demo.entities.user.UserRole;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "S")
public class Student extends User {


    @ManyToMany
    @JoinColumn(name = "course_id") // Nome da coluna na tabela Student que referencia a tabela Courses
    private Courses course;
    
    @ManyToOne
    @JoinColumn(name = "class_id") // Nome da coluna na tabela Student que referencia a tabela Classes
    private Classes classe;

    public Student(Courses course, Classes classe) {
        this.course = course;
        this.classe = classe;
    }

    public Student(Long id, String login, String password, UserRole role, Courses course, Classes classe) {
        super(id, login, password, role);
        this.course = course;
        this.classe = classe;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Classes getClasse() {
        return classe;
    }

    public void setClasse(Classes classe) {
        this.classe = classe;
    }
    
}