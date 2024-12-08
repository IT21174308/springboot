package org.springbootcrud.restapi.controller;

import org.springbootcrud.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //Get students by id
    //localhost:8080/students/1
    @GetMapping("/students/{id}")
    public student getStudent(@PathVariable int id) {
        student students = repo.findById(id).get();
        return students;
    }

    //add students
    //localhost:8080/student/add
    @PostMapping("/student/add")
    public void createStudent(@RequestBody student student) {
        repo.save(student);
    }

}
