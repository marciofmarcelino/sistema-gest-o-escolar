package com.systemmanager.demo.entities.user.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    
    public Student creatStudent(Student student){
        return studentRepository.save(student);
    }
}
