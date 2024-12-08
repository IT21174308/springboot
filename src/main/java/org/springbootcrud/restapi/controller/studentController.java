package org.springbootcrud.restapi.controller;

import org.springbootcrud.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/student/add")
    public void createStudent(@RequestBody student student) {
        repo.save(student);
    }

    //update student record
    //localhost:8080/student/update/1
    @PutMapping("/student/update/{id}")
    public student updateStudent(@PathVariable int id){
        student students = repo.findById(id).get();
        students.setBranch("test");
        students.setName("testname");
        repo.save(students);
        return students;
    }

    //delete student
    //localhost:8080/student/delete/1
    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        student students = repo.findById(id).get();
        repo.delete(students);
    }
}
