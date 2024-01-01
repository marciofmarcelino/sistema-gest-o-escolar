package com.systemmanager.demo.entities.user.teacher;

import com.systemmanager.demo.entities.classes.Classes;
import com.systemmanager.demo.entities.courses.Courses;
import com.systemmanager.demo.entities.user.User;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "T")
public class Teacher extends User {
    @ManyToMany
    private Courses course;

    @ManyToMany
    private Classes classes;

}