package org.springbootcrud.restapi.controller;

import org.springbootcrud.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springbootcrud.restapi.entity.student;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@RestController
public class studentController {

    @Autowired
    StudentRepository repo;
    //Get all students
    //localhost:8080/students
    @GetMapping("/students")
    public List<student> getAllStudents (){
        List<student> students = repo.findAll();
        return students;
    }
}
